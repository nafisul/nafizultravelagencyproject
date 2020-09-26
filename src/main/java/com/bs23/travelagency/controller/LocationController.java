package com.bs23.travelagency.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Created by nafizul.islam on 9/26/2020.
 */
@Controller
public class LocationController {
    private final static Logger logger = LogManager.getLogger(LocationController.class);
    @GetMapping("/location")
    public String index(){
        return "";
    }
}
