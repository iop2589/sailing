package com.boot.sailing.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.sailing.service.MenuService;
import com.boot.sailing.vo.CoffeeMenu;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/menu")
public class MenuController {

  @Autowired
  MenuService menuService;

  @GetMapping("/menu")
  public String doMenu (Model model) {

    List<CoffeeMenu> list = menuService.getMenu();
    model.addAttribute("list", list);
    return "/menu/menu";

  }

  @GetMapping("/menu_insert")
  public String moveMenuInsert() {
    return "/menu/menu_insert";
  }

  @PostMapping("/menu_insert")
  public String doMenuInsert (@ModelAttribute CoffeeMenu coffeeMenu) {

    int result = menuService.doMenuInsert(coffeeMenu);

    return "redirect:/menu/menu";
  }

  @GetMapping("/menu_delete")
  public String doMenuDelete (@ModelAttribute CoffeeMenu coffeeMenu) {

    int result = menuService.doMenuDelete(coffeeMenu);
    return "redirect:/menu/menu";

  }

  @GetMapping("/menu_update")
  public String moveMenuUpdate (Model model, @ModelAttribute CoffeeMenu coffeeMenu) {

    CoffeeMenu coffeeMenuResult = menuService.getMenuOne(coffeeMenu);
    model.addAttribute("coffeeMenu", coffeeMenuResult);
    return "/menu/menu_update";

  }

  @PostMapping("/menu_update")
  public String doMenuUpdate (@ModelAttribute CoffeeMenu coffeeMenu) {
    int result = menuService.doMenuUpdate(coffeeMenu);
    return "redirect:/menu/menu";
  }

  @PostMapping("/menu_search")
  public String doMenu (Model model,
                        @RequestParam("start_date") String startDate, 
                        @RequestParam("end_date") String endDate, 
                        @RequestParam(value="menu_name", defaultValue="ALL") String name, 
                        @RequestParam("kind") String kind) {
    List<CoffeeMenu> list = menuService.getMenu(startDate, endDate, name, kind);
    
    model.addAttribute("list", list);

    return "/menu/menu";
  }

  @PostMapping("/update_price")
  public String doMenuPriceUpdate (@RequestParam("menu_check") List<Integer> chkList,
                                   @RequestParam("hidden_price") Integer price) {
    log.debug("************************** price ::: " + price);
    if (chkList != null) {
      int result = menuService.doMenuPriceUpdate (chkList, price);
    }

    return "redirect:/menu/menu";
  }
}
