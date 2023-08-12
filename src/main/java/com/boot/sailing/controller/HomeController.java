package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/home")
public class HomeController {

  @GetMapping("/home")
  public String doHome() {
    return  "/home/home";
  }


  @GetMapping(value="/rest2")
  @ResponseBody
  public String doRest2() {
      return "hello";
  }
  
}
