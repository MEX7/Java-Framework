package com.anjibei.app.framework.uitls;



import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.Date;
import java.util.Properties;

/**
 * Created by MEX on 15/1/7.
 */
public class EmailOperations {

    public Boolean sentEmail(String userId, String url)
    {
        Boolean bool = Boolean.FALSE;
        // 目标邮箱
        String toMail       = userId;
        // 返回网址
        String returnUrl    = url;

        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.yeah.net");
        props.setProperty("mail.smtp.auth", "true");

        String username = "mixmore@yeah.net";
        String password = "*";

        Authenticator authenticator = new MyAuthenticator(username, password);

        javax.mail.Session session = javax.mail.Session.getDefaultInstance(props,authenticator);
        session.setDebug(true);

        try{
            Address from = new InternetAddress(username);
            Address to = new InternetAddress(toMail);

            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(from);
            msg.setSubject("FIMS质量检测系统用户激活");
            msg.setSentDate(new Date());
            String myurl="点击下侧链接完成激活!"+"<a href="+url+" >"+url+"</a>";
            msg.setContent(myurl, "text/html;charset=utf-8");

            msg.setRecipient(RecipientType.TO, to);
            Transport.send(msg);
            bool = true;
        } catch(MessagingException e){
            e.printStackTrace();
        }
        return bool;
    }
}
