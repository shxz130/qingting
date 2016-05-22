package com.qingting.controller;

import com.qingting.service.VideoService;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    private static Logger LOG= Logger.getLogger(Admin.class);
    @Autowired
    private VideoService videoService;

    @RequestMapping(value = "init.shtml",method = { RequestMethod.POST, RequestMethod.GET })
    public String home(){
        LOG.info(videoService.getCount(null));
        return BASE_URL+"index";
    }

}
