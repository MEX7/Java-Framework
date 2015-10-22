package com.anjibei.app.framework.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by hedingwei on 3/6/15.
 */
@Controller
public class TaskController {

    @RequestMapping("/task/taskview.do")
    public ModelAndView taskpanel() {
        ModelAndView view = new ModelAndView("task/taskpanel");
        return view;
    }

    @RequestMapping("/task/viewtask.do")
    public ModelAndView viewtask() {
        ModelAndView view = new ModelAndView("task/viewtask");
        return view;
    }

    @RequestMapping("/task/sourceview.do")
    public ModelAndView sourceview(@RequestParam(value = "version", required = false) String version) {
        ModelAndView view = new ModelAndView("task/sourceview");
        if (version == null) {
            // 读取最新版本
            view.addObject("code_version", version);
            view.addObject("code", "some code");
            return view;
        } else {
            view.addObject("code_version", version);
            view.addObject("code", "some code");
        }
        return view;
    }

    @RequestMapping("/task/newsource.do")
    public ModelAndView newsource(@RequestParam(value = "mode", required = true) String mode, HttpServletResponse response) {
        ModelAndView view_newsource = new ModelAndView("task/newsource");
        ModelAndView view_sourceview = new ModelAndView("redirect:/task/sourceview.do");
        if ("new".equals(mode)) {
            return view_newsource;
        } else if ("save".equals(mode)) {

            return view_sourceview;
        } else {
            return view_newsource;
        }

    }

}
