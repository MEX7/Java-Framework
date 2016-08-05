package com.anjibei.app.framework.uitls;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by MEX on 2014/11/16.
 */
public class TimeUtils {

    public static int time()
    {
        long nowTime = System.currentTimeMillis();
        int time = (int)(nowTime/1000);
        return  time;
    }

    public static int[][] getYearTimeArray(int time) throws ParseException {
        // 初始化二维数组
        int intArray[][] = new int[12][2];
        String date = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date(time * 1000l));
        String year = date.substring(0, 4);
        System.out.println(date);
        for (int i=0; i<2; i++ )
        {
            for (int j=0; j<12; j++)
            {
                if (i==0)
                {
                    Date epochS = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("1" + "/" + Integer.toString(j+1) + "/" + year + " " + "00:00:00");
                    intArray[j][i] = (int) (epochS.getTime() / 1000);
                }
                else if (i==1)
                {
                    intArray[j][i] = getMonthlyEndTime(Integer.toString(j+1), year);
                }
            }
        }
        return intArray;
    }

    private static int getMonthlyEndTime(String month, String year) throws ParseException
    {
        int endTime = 0;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (month.equals("2")) {
            int yearInt = Integer.parseInt(year);
            if (((yearInt % 4 == 0) && (yearInt % 100 != 0)) || yearInt % 400 == 0) {
                //闰年2月29天
                Date epochE = format.parse("29" + "/" + month + "/" + year + " " + "23:59:59");
                endTime = (int) (epochE.getTime() / 1000);
                System.out.println(year + " 是闰年");
            } else {
                //平年2月28天
                Date epochE = format.parse("28" + "/" + month + "/" + year + " " + "23:59:59");
                endTime = (int) (epochE.getTime() / 1000);
                System.out.println(year + " 不是闰年");
            }
        } else if (month.equals("1") || month.equals("3") || month.equals("5") || month.equals("7")
                || month.equals("8") || month.equals("10") || month.equals("12")) {
            //1,3,5,7,8,10,12月31天
            Date epochE = format.parse("31" + "/" + month + "/" + year + " " + "23:59:59");
            endTime = (int) (epochE.getTime() / 1000);

        } else {
            Date epochE = format.parse("30" + "/" + month + "/" + year + " " + "23:59:59");
            endTime = (int) (epochE.getTime() / 1000);
        }
        return endTime;
    }

    public static int getDailyStartTime(int checkOutTime) throws ParseException {
        int startTime = 0;
        String date = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date(checkOutTime * 1000l));
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8, 10);
        Date epochS = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(day + "/" + month + "/" + year + " " + "00:00:00");
        startTime = (int) (epochS.getTime() / 1000);
        return startTime;
    }

    //获取当日结束时间
    public static int getDailyEndTime(int checkOutTime) throws ParseException {
        int endTime = 0;
        String date = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date(checkOutTime * 1000l));
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8, 10);
        Date epochE = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(day + "/" + month + "/" + year + " " + "23:59:59");
        endTime = (int) (epochE.getTime() / 1000);
        return endTime;
    }

    public static int getMonthlyStartTime(int checkOutTime) throws ParseException {
        int startTime = 0;
        String date = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date(checkOutTime * 1000l));
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        //String day = date.substring(8, 10);
        Date epochS = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("01" + "/" + month + "/" + year + " " + "00:00:00");
        startTime = (int) (epochS.getTime() / 1000);
        return startTime;
    }

    //获取当月结束时间
    public static int getMonthlyEndTime(int checkOutTime) throws ParseException {
        int endTime = 0;
        String date = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date(checkOutTime * 1000l));
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        //String day = date.substring(8, 10);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if (month.equals("02")) {
            int yearInt = Integer.parseInt(year);
            if (((yearInt % 4 == 0) && (yearInt % 100 != 0)) || yearInt % 400 == 0) {
                //闰年2月29天
                Date epochE = format.parse("29" + "/" + month + "/" + year + " " + "23:59:59");
                endTime = (int) (epochE.getTime() / 1000);
                System.out.println(year + " 是闰年");
            } else {
                //平年2月28天
                Date epochE = format.parse("28" + "/" + month + "/" + year + " " + "23:59:59");
                endTime = (int) (epochE.getTime() / 1000);
                System.out.println(year + " 不是闰年");
            }
        } else if (month.equals("01") || month.equals("03") || month.equals("05") || month.equals("07")
                || month.equals("08") || month.equals("10") || month.equals("12")) {
            //1,3,5,7,8,10,12月31天
            Date epochE = format.parse("31" + "/" + month + "/" + year + " " + "23:59:59");
            endTime = (int) (epochE.getTime() / 1000);

        } else {
            Date epochE = format.parse("30" + "/" + month + "/" + year + " " + "23:59:59");
            endTime = (int) (epochE.getTime() / 1000);
        }
        //endTime = (int) (epochE.getTime() / 1000);
        return endTime;

    }

}
