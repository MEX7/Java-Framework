package com.anjibei.app.framework.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hedingwei on 3/4/15.
 */
@Controller
public class UIElementsController {

    @RequestMapping("/uielements/alerts.do")
    public String alerts() {
        return "uielements/alerts";
    }


    @RequestMapping("/uielements/buttons.do")
    public String buttons() {
        return "uielements/buttons";
    }

    @RequestMapping("/uielements/extras.do")
    public String extras() {
        return "uielements/extras";
    }

    @RequestMapping("/uielements/graphs.do")
    public String graphs() {
        return "uielements/graphs";
    }

    @RequestMapping("/uielements/icons.do")
    public String icons() {
        return "uielements/icons";
    }

    @RequestMapping("/uielements/modals.do")
    public String modals() {
        return "uielements/modals";
    }

    @RequestMapping("/uielements/widgets.do")
    public String widgets() {
        return "uielements/widgets";
    }

    @RequestMapping("/uielements/sliders.do")
    public String sliders() {
        return "uielements/sliders";
    }


    @RequestMapping("/uielements/tabs-accordions.do")
    public String tabs_accordions() {
        return "uielements/tabs-accordions";
    }

    @RequestMapping("/uielements/typography.do")
    public String typography() {
        return "uielements/typography";
    }


}
