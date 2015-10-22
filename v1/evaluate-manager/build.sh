#!/bin/bash

WORK_DIR=`dirname $0`
WORK_DIR=`cd ${WORK_DIR}; pwd`
echo "Work dir: ${WORK_DIR}"

echo "Setting up environment variables ..."
MAVEN_HOME=/usr/local/Cellar/maven/3.2.3/libexec
if [ ! -d "${MAVEN_HOME}" ]; then
    MAVEN_HOME=${WORK_DIR}/../thirdparty/maven/apache-maven-3.2.3
fi

if [ ! -d "${JAVA_HOME}" ]; then
    JAVA_HOME=${WORK_DIR}/../thirdparty/jdk7
fi

export MAVEN_HOME && export JAVA_HOME
export PATH=${MAVEN_HOME}/bin:${JAVA_HOME}/bin:${PATH}
export MAVEN_OPTS="-Dgroovy.source.encoding=UTF-8 -XX:PermSize=512m"

PROJECT_NAME=evaluate-manager
TAR_GZ_PACKAGE_NAME=${PROJECT_NAME}.tar.gz
OUTPUT_DIR=${WORK_DIR}/output

echo "Remove output dir ..."
rm -rf ${OUTPUT_DIR}

echo "Make output dir ..."
mkdir -p ${OUTPUT_DIR}

VERSION_NAME=server.version

echo "Generate verion and timestamp..."
cd ${WORK_DIR}
rm -rf "./"${VERSION_NAME}
rm -rf "./src/main/resource/"${VERSION_NAME}

echo "BuildTime: "$(date "+%Y-%m-%d %H:%M:%S") >> "./"${VERSION_NAME}
svn info >> "./"${VERSION_NAME}
cp "./"${VERSION_NAME} "./src/main/resource/"${VERSION_NAME}

echo "Running maven ..."
if [ $# -eq 0 ]; then
    mvn clean install assembly:assembly -Dmaven.test.skip=true
elif [ $1 == "all" ]; then
    mvn clean install assembly:assembly -Dmaven.test.skip=true
else
    mvn $@
    exit
fi

if [ $? -ne 0 ];then
	exit 1
fi
echo "Copy code to output dir..."
cp -r ${WORK_DIR}/../thirdparty/jre7 ${OUTPUT_DIR}/java
cp -r ${WORK_DIR}/target/${TAR_GZ_PACKAGE_NAME} ${OUTPUT_DIR}

cd ${OUTPUT_DIR}
tar -xzf ${TAR_GZ_PACKAGE_NAME}
rm -rf ${TAR_GZ_PACKAGE_NAME}

echo "Delete .git file ..."
for i in `find . -name ".git"`;do
    rm -rf $i;
done

echo "Make bin executeable..."
cd ${OUTPUT_DIR}"/bin"
chmod 755 ./*
#dos2unix ./*.sh

echo "Compress code ..."
cd ${OUTPUT_DIR}
tar -czf ${TAR_GZ_PACKAGE_NAME} ./*
if [ $? -ne 0 ]; then
    echo "create "${TAR_GZ_PACKAGE_NAME} "failed!"
    exit 2
fi

ls | grep -v ${TAR_GZ_PACKAGE_NAME} | xargs rm -rf
echo ${TAR_GZ_PACKAGE_NAME} "build success at dir "${OUTPUT_DIR}
exit 0
