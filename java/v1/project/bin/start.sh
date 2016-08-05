#!/bin/bash

readonly PROJECT=user-manager
readonly MAIN_CLASS="com.newthread.fims.evaluateManager.JettyStart"

if [ $# != "1" ]; then
    usage
fi

DATE=`date +%Y%m%d-%H%M`
ACTION=$1

usage()
{
    echo  "Usage: "${PROJECT}".sh [start|stop|restart|check]"
}

checkUlimit()
{
    RET=`ulimit -n`
#    echo "${RET}"
    if [ ${RET} -lt 10000 ];then
        echo "ulimit "${RET} "is less than 10000"
        RETVAL=1
    else
        RETVAL=0
    fi

    return ${RETVAL}
}

checkProcess()
{
    RET=`ps aux | grep ${MAIN_CLASS} | grep -v "grep"`
#    echo "${RET}"
    if [ -n "${RET}" ];then
        echo ${RET} |awk '{print $2}' >${PROJECT}.pid
        RETVAL=0
    else
        RETVAL=1
    fi

    return ${RETVAL}
}

checkPort()
{
    RET=`netstat -anp|grep 28236`
#    echo "${RET}"
    if [ -n "${RET}" ];then
        RETVAL=0
    else
        RETVAL=1
    fi

    return ${RETVAL}
}

check()
{
    echo ${DATE} ${PROJECT} ${ACTION} "begin!"
    checkProcess
    PROCESS=`echo $?`
    #checkPort
    PORT=`echo $?`

    if [ ${PROCESS} -eq 0 ];then
        echo ${DATE} ${PROJECT} ${ACTION} "success!"
        RETVAL=0
    else
        echo ${DATE} ${PROJECT} ${ACTION} "fail!"
        RETVAL=1
    fi

    return ${RETVAL}
}

start()
{
    echo ${DATE} ${PROJECT} ${ACTION} "begin!"

    checkProcess
    PROCESS=`echo $?`
    if [ ${PROCESS} -eq 0 ];then
        echo ${PROJECT} "is already started!"
        RETVAL=1
        return ${RETVAL}
    fi

    #checkUlimit
    ULIMIT=`echo $?`
    if [ ${ULIMIT} -eq 1 ];then
        echo "ulimit is not enough!"
        RETVAL=1
        return ${RETVAL}
    fi

    WORK_DIR=`dirname $0`
    WORK_DIR=`cd ${WORK_DIR}; pwd`
    echo "Work dir:"${WORK_DIR}

    cd ${WORK_DIR}
    cd ..
    WORK_DIR=`pwd`
    echo "Work dir:"${WORK_DIR}

    LIB_DIR=${WORK_DIR}/lib
    CONF_DIR=${WORK_DIR}/conf
    LOGS_DIR=${WORK_DIR}/log

    if [ ! -d ${LOGS_DIR} ];then
        mkdir -p ${LOGS_DIR}
    fi

    echo "Setting up environment variable..."
    JAVA_HOME=${WORK_DIR}/java7/Contents/Home
    JAVA_ARGS="-server -Xmx8096m -Xms8096m -Xmn2048m -XX:SurvivorRatio=8 -XX:PermSize=512m -XX:MaxPermSize=512m -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:+CMSClassUnloadingEnabled -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=80 -XX:+UseCMSCompactAtFullCollection -XX:CMSFullGCsBeforeCompaction=0 -XX:-CMSParallelRemarkEnabled -XX:SoftRefLRUPolicyMSPerMB=0 -XX:MaxTenuringThreshold=7 -Xloggc:${LOGS_DIR}/${PROJECT}-gc.log -XX:+PrintGCDateStamps -XX:+PrintGCDetails -XX:+PrintHeapAtGC"
    CLASSPATH=.:${JAVA_HOME}/lib/dt.jar:${JAVA_HOME}/lib.tools.jar
    CLASSPATH=${CLASSPATH}:${CONF_DIR}
    files=`ls -1 ${LIB_DIR}`
    for file in $files;do
        CLASSPATH=${CLASSPATH}:${LIB_DIR}/$file
    done

	export JAVA_HOME
    export CLASSPATH

    if [ -f ${LOGS_DIR}/gc.log ];then
        mv ${LOGS_DIR}/gc.log ${LOGS_DIR}/gc.log.${DATE}
    fi

    java ${JAVA_ARGS} ${MAIN_CLASS} &
    sleep 3

    checkProcess
    PROCESS=`echo $?`
    if [ ${PROCESS} -eq 0 ];then
         echo ${DATE} ${PROJECT} ${ACTION} "success!"
         RETVAL=0
    else
         echo ${DATE} ${PROJECT} ${ACTION} "fail!"
         RETVAL=2
    fi

    return ${RETVAL}
}

stop()
{
    echo ${DATE} ${PROJECT} ${ACTION} "begin!"

    checkProcess
    PROCESS=`echo $?`
    if [ ${PROCESS} -eq 1 ];then
        echo ${PROJECT} "is already stopped!"
        RETVAL=1
        return ${RETVAL}
    fi

    SERVER_PIDS=`ps aux | grep ${MAIN_CLASS} | grep -v "grep"| awk '{print $2}'`
    for id in $SERVER_PIDS;do
       kill -9 ${id}
       echo "kill process,pid:${id}"
    done

    checkProcess
    PROCESS=`echo $?`
    if [ ${PROCESS} -eq 0 ];then
          echo ${DATE} ${PROJECT} ${ACTION} "fail!"
          RETVAL=2
     else
          echo ${DATE} ${PROJECT} ${ACTION} "success!"
          RETVAL=0
     fi

     return ${RETVAL}
}

RETVAL=1
case "${ACTION}" in
    *restart)
    stop
    sleep 1
    start
    ;;

    *start)
    start
    ;;

    *stop)
    stop
    ;;

    *check)
    check
    ;;

    *reload)
    reload
    ;;

    *)
    usage
    ;;
esac

exit ${RETVAL}
