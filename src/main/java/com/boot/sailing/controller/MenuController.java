package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {
  @RequestMapping("/menu")
  public String doMenu () {
    return "/menu/menu";
  }
}
