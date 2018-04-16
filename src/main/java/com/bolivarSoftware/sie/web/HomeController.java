package com.bolivarSoftware.sie.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Damian Gallego on 16/4/2018.
 */
@Controller
@RequestMapping("/")
public class HomeController {


    @RequestMapping(value = {"/", "index", "inicio"})
    public String inicio(){
        return "index";
    }


    @RequestMapping(value = {"login"})
    public String login(){
        return "login";
    }
}
