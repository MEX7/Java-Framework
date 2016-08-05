package com.anjibei.app.framework.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hedingwei on 3/6/15.
 */
@Controller
public class MyToolsController {

    @RequestMapping("/mytools/myvm.do")
    public ModelAndView myvm() {
        ModelAndView view = new ModelAndView("mytools/myvm");
        return view;
    }

    @RequestMapping("/mytools/codetools.do")
    public ModelAndView codetools() {
        ModelAndView view = new ModelAndView("mytools/codetools");
        return view;
    }

    @RequestMapping("/mytools/mysourcesbag.do")
    public ModelAndView mysourcebag() {
        ModelAndView view = new ModelAndView("mytools/mysourcesbag");
        return view;
    }

    @RequestMapping("/mytools/mywikilab.do")
    public ModelAndView mywikilab() {
        ModelAndView view = new ModelAndView("mytools/mywikilab");
        return view;
    }

}
