package com.anjibei.app.framework.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hedingwei on 3/4/15.
 */
@Controller
public class FormsController {

    @RequestMapping("/forms/code-editor.do")
    public String alerts() {
        return "forms/code-editor";
    }


    @RequestMapping("/forms/general-forms.do")
    public String buttons() {
        return "forms/general-forms";
    }

    @RequestMapping("/forms/form-layouts.do")
    public String extras() {
        return "forms/form-layouts";
    }

    @RequestMapping("/forms/wysiwyg.do")
    public String graphs() {
        return "forms/wysiwyg";
    }

    @RequestMapping("/forms/form-validation.do")
    public String icons() {
        return "forms/form-validation";
    }

    @RequestMapping("/forms/form-wizards.do")
    public String modals() {
        return "forms/form-wizards";
    }
}
