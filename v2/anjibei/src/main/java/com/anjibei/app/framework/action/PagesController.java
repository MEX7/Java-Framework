package com.anjibei.app.framework.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hedingwei on 3/4/15.
 */
@Controller
public class PagesController {

    @RequestMapping("/pages/notfound.do")
    public String alerts() {
        return "pages/notfound";
    }


    @RequestMapping("/pages/blank.do")
    public String buttons() {
        return "pages/blank";
    }

    @RequestMapping("/pages/cal.do")
    public String extras() {
        return "pages/cal";
    }

    @RequestMapping("/pages/invoice.do")
    public String graphs() {
        return "pages/invoice";
    }

    @RequestMapping("/pages/locked.do")
    public String icons() {
        return "pages/locked";
    }

    @RequestMapping("/pages/media-manager.do")
    public String modals() {
        return "pages/media-manager";
    }

    @RequestMapping("/pages/people-directory.do")
    public String widgets() {
        return "pages/people-directory";
    }

    @RequestMapping("/pages/profile.do")
    public String sliders() {
        return "pages/profile";
    }


    @RequestMapping("/pages/search-results.do")
    public String tabs_accordions() {
        return "pages/search-results";
    }


}
