/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anjibei.app.framework.services;

import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/example")
public class ExampleService {

    private static Logger logger = Logger.getLogger(ExampleService.class);
    @Autowired
    private HttpSession httpSession;

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject helloworld(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "age", required = true) int age) throws IOException {
        JSONObject obj = new JSONObject();
        obj.put("msg", "hello world!ABC");
        obj.put("name", name);
        obj.put("age", age);
        obj.put("p", (String) httpSession.getAttribute("userId"));
        return obj;
    }

    @RequestMapping(value = "/helloworld1", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject helloworld1() throws IOException {
        JSONObject obj = new JSONObject();
        obj.put("msg", "hello world!ABC");
        obj.put("p", new File(".").getAbsolutePath());
        return obj;
    }

    /*

    @RequestMapping(value = "/sentUserActivateEmail")
    @ResponseBody
    public void sendEmail(HttpServletRequest req, HttpServletResponse resp) throws IOException, SQLException {
        resp.setContentType("text/html;charset=UTF-8");
        String parameter = new String(StreamResolve.InputStreamTOByte(req.getInputStream()), "UTF-8");
        //String parameter="{\"sid\":\"E6B74C7B4D6C56F4F54B78F3F143C19A\",\"userId\":\"442399850@qq.com\"}";
        TUser tUser= (TUser) JsonUtils.getInstance().jsonStr2Object(parameter,TUser.class);

        Boolean aBoolean = sentEmail(tUser.getUserId());
        BaseReturnModul baseReturnModul=new BaseReturnModul();
        if (aBoolean==true){

            baseReturnModul.setCode(Constant.SUCCESS_CODE);
            baseReturnModul.setMessage("发送邮件成功");
        }else {
            baseReturnModul.setCode(Constant.ERROR_CODE);
            baseReturnModul.setMessage("发送邮件失败");
        }
        resp.getWriter().print(JsonUtils.getInstance().objec2JsonStr(baseReturnModul));
    }

    */

//    @RequestMapping(value = "/insertComment")
//    @ResponseBody
//    public JSONObject insertComment(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        System.out.println("#####insertComment start#####");
//        // 获取入参
//        resp.setContentType("text/html;charset=UTF-8");
//        String parameter = new String(StreamResolve.InputStreamTOByte(req.getInputStream()), "UTF-8");
//        parameter = java.net.URLDecoder.decode(parameter, "utf-8");
//
//        JSONObject obj = new JSONObject();
//
//        SessionId sessionId = (SessionId) JsonUtils.getInstance().jsonStr2Object(parameter, SessionId.class);
//        if (CommonLogic.checkSession(sessionId.getSid())) {
//            try {
//                // TODO 写入评论
//
//            } catch (Throwable throwable) {
//                throwable.printStackTrace();
//            }
//        } else {
//            obj = CommonLogic.checkPowerFail();
//        }
//
//        System.out.println("#####insertComment end#####");
//        return obj;
//    }
}
