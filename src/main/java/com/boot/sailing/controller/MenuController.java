package com.boot.sailing.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.sailing.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

  @Autowired
  MenuService menuService;

  @RequestMapping("/menu")
  public String doMenu (Model model) {
    List<Map<String, Object>> list = menuService.getMenu();
    model.addAttribute("list", list);
    return "/menu/menu";
  }

}
