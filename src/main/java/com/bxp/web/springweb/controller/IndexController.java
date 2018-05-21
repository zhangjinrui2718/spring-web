package com.bxp.web.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Controller
public class IndexController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        String value = LocalDateTime.now().toString();
        request.setAttribute("time",value);
        request.setAttribute("name","包秀平");
        return "index";
    }
}
