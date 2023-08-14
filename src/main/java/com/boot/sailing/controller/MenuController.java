package com.boot.sailing.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.sailing.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

  @Autowired
  MenuService menuService;

  @GetMapping("/menu")
  public String doMenu (Model model) {

    List<Map<String, Object>> list = menuService.getMenu();
    model.addAttribute("list", list);
    return "/menu/menu";

  }

  @GetMapping("/menu_insert")
  public String moveMenuInsert() {
    return "/menu/menu_insert";
  }

  @PostMapping("/menu_insert")
  public String doMenuInsert (@RequestParam("coffeename") String name, 
                           @RequestParam("kind") String kind,
                           @RequestParam("price") int price) {

    int result = menuService.doMenuInsert(name, kind, price);

    return "redirect:/menu/menu";
  }

  @GetMapping("/menu_delete")
  public String doMenuDelete (@RequestParam("no") int no) {

    int result = menuService.doMenuDelete(no);
    return "redirect:/menu/menu";

  }

  @GetMapping("/menu_update")
  public String moveMenuUpdate (Model model, @RequestParam("no") int no) {

    Map<String, Object> map = menuService.getMenuOne(no);
    model.addAttribute("map", map);
    return "/menu/menu_update";

  }

  @PostMapping("/menu_update")
  public String doMenuUpdate (@RequestParam("no") int no, 
                              @RequestParam("coffeename") String name, 
                              @RequestParam("kind") String kind, 
                              @RequestParam("price") int price) {
    int result = menuService.doMenuUpdate(no, name, kind, price);
    return "redirect:/menu/menu";
  }
}
