package com.newthread.fims.evaluateManager.common.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by MEX on 2014/11/16.
 */
public class TimeConversion {

    // TODO 时间转换的函数
    /* @param String 2014-06-01T23:00:10Z
     * @return int 11位的时间戳
     */
    public static int Date2Timestamp(String dateStr){
        String myStr=dateStr.replace("T"," ").replace("Z", "");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = null;
        try{
            d = df.parse(myStr);
        }catch (ParseException e){

        }
        long l=d.getTime();
        int i=(int)(l/1000);
        return i;
    }
    /* @param int 11位的时间戳
    * @return String 2014-06-01T23:00:10Z
    */

    public static String Timestamp2Date(int mytime){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long time=(long)mytime;
        String str;
        str = df.format(time * 1000);
        String[] strarray=str.split(" ");
        String result=strarray[0]+"T"+strarray[1]+"Z";
        return result;
    }

    public static int getTime()
    {
        long nowTime = System.currentTimeMillis();
        int time = (int)(nowTime/1000);
        return  time;
    }
}
