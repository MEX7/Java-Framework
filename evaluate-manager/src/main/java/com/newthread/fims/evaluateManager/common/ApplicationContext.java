package com.newthread.fims.evaluateManager.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MEX on 2014/11/10.
 */
public class ApplicationContext {
    private static ApplicationContext applicationContext;
    private static ClassPathXmlApplicationContext classPathXmlApplicationContext;
    private ApplicationContext(){
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
    }

    public static ClassPathXmlApplicationContext getIntance(){
        if (applicationContext==null){
            applicationContext=new ApplicationContext();
        }
        return  classPathXmlApplicationContext;

    }

    public static void close(){
        if (classPathXmlApplicationContext != null)
        {
            classPathXmlApplicationContext.close();
        }
    }
}
