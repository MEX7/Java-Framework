package com.anjibei.app.framework.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hedingwei on 3/4/15.
 */
@Controller
public class TablesController {

    @RequestMapping("/tables/basic-tables.do")
    public String alerts() {
        return "tables/basic-tables";
    }


    @RequestMapping("/tables/data-tables.do")
    public String buttons() {
        return "tables/data-tables";
    }


}
