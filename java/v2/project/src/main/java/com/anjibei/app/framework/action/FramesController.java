package com.anjibei.app.framework.action;

import com.anjibei.app.framework.uitls.Application;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import java.lang.reflect.Field;

/**
 * Created by hedingwei on 3/4/15.
 */
@Controller
public class FramesController {
    @RequestMapping("/navigator.do")
    public ModelAndView navigator(@RequestParam(value = "view", required = false) String view) {
        String applicationName = Application.getApplicationContext().getApplicationName();
        String prefix = "";
        Object t = Application.getBean("_internal_irvr");
        try {
            Field f = UrlBasedViewResolver.class.getDeclaredField("prefix");
            f.setAccessible(true);
            prefix = (String) f.get(t);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        String index = view.replace(applicationName + prefix, "").replace(".jsp", "");


        ModelAndView mav = new ModelAndView("navigator");
        mav.addObject("viewIndex", index);
        if (index.lastIndexOf("/") > 0) {
            mav.addObject("viewParent", index.substring(0, index.lastIndexOf("/")));
        }

        mav.addObject("page_" + index, "active");

//        mav.getModel().put("parentIndex")


        return mav;
    }

    @RequestMapping("/header.do")
    public String header() {
        return "header";
    }


}
