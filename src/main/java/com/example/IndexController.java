package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SorisMacAir on 16. 6. 17..
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard.component";
    }

    @RequestMapping("/heroes")
    public String heroes() {
        return "heroes.component";
    }

    @RequestMapping("/hero-detail")
    public String heroDetail() {
        return "hero-detail.component";
    }

}
