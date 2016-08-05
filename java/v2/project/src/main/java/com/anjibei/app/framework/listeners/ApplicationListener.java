/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anjibei.app.framework.listeners;

import com.anjibei.app.framework.uitls.AESUtils;
import com.anjibei.app.framework.uitls.Application;
import com.anjibei.app.framework.uitls.MD5Utils;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.SecretKey;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.UnsupportedEncodingException;

/**
 * Web application lifecycle listener.
 *
 * @author hedingwei
 */
public class ApplicationListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Hello. Application Started.");
        System.out.println("Working Dir: " + Application.getWorkingDir().getAbsolutePath());

        String s = new String("tangfuqiang");
        System.out.println("原始：" + s);
        String md5 = MD5Utils.md5(s);

        System.out.println(md5);


        SecretKey key = AESUtils.generateSecretKey();
        byte[] keyBytes = AESUtils.getKeyBytes(key);
        key = AESUtils.getSecretKey(keyBytes);
        String encrypted = null;
        try {
            encrypted = Base64.encodeBase64String(AESUtils.encrypt(md5, key));
            byte[] decrypted = AESUtils.decrypt(Base64.decodeBase64(encrypted.getBytes("utf-8")), key);
            System.out.println(encrypted);
            System.out.println(new String(decrypted));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Hello. Application Stopped.");
    }
}
