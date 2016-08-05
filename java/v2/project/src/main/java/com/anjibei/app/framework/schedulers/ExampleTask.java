package com.anjibei.app.framework.schedulers;

import com.anjibei.app.framework.config.Constant;
import com.anjibei.app.framework.uitls.JPushUtils;
import com.anjibei.app.framework.uitls.TimeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by MEX on 15/3/24.
 */
public class ExampleTask {
    private static final Logger logger = Logger.getLogger(ExampleTask.class.toString());

    public void run1() {
//        System.out.println("-------定时方法------");
        List<String> messageList = new ArrayList<>();
        messageList.add("【妈妈想宝宝了吗？今天我长这样哟】宝宝每一天都不一样，妈妈记挂宝宝了就来安吉贝今日贴士看看宝宝今天的新鲜模样吧！");
        messageList.add("【妈妈，宝宝喊你一起学知识啦】妈妈学知识，宝宝更健康。一字一句都是关怀，安吉贝每日母婴文章更新啦，好学的妈妈看过来！");
        messageList.add("【妈妈，宝宝想看这个好玩儿的】五花八门，五彩纷呈。安吉贝每日视频更新啦！轻松看视频，简易学知识，带您炫酷带您飞！");
        messageList.add("【妈妈，你难道忘记宝宝了吗】呜呜呜，宝宝不开心了，妈妈没有按时来安吉贝完成每月任务哦！妈妈不要忘记宝宝，快来继续做任务吧！");
        messageList.add("【妈妈，宝宝想出去玩儿啦】世界那么大，妈妈带上宝宝出去走走吧！安吉贝偷偷告诉您，这里的母婴活动真有趣，别错过哦！");
        messageList.add("【妈妈快行动，宝宝要买买买】哇咔咔，又一家母婴店有优惠活动了！安吉贝可是第一时间告诉妈妈了哦，宝宝等着您给他买礼物呢！");
        messageList.add("【妈妈过来，宝宝有新鲜事了】作为一个活泼的宝宝，当然每天都过得有声有色。妈妈帮帮宝宝记录这些珍贵的日子，来安吉贝写日记吧！");
        int dif = (TimeUtils.time() - 1444579200)/ Constant.SECONDS_TO_DAYS;
        JPushUtils.SendPushToAll(messageList.get(dif % 7));
//        File file = new File("var");
//        file.mkdir();
//        org.apache.mina.filter.statistic.ProfilerTimerFilter p = (ProfilerTimerFilter) SpringContextUtil.getBean("profilerFilter");
//
//        JSONObject obj = new JSONObject();
//
//        obj.put("")
    }
}
