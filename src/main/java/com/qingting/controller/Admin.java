package com.qingting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by shxz130 on 2015/3/5.
 */
@Controller
@RequestMapping("admin")
public class Admin {

    private static String BASE_URL="video/";

    @RequestMapping(value = "init.shtml",method = { RequestMethod.POST, RequestMethod.GET })
    public String home(){
        return BASE_URL+"index";
    }

}
