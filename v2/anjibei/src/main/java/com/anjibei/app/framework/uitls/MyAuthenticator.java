package com.anjibei.app.framework.uitls;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * Created by MEX on 15/1/8.
 */
public class MyAuthenticator extends Authenticator{
    private String username;
    private String password;

    public MyAuthenticator(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(username, password);
    }
}
