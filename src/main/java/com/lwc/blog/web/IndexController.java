package com.lwc.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Liweicheng
 * @create 2020/10/8 - 20:50
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
//        int i=9/0;
        return "index";
    }
}
