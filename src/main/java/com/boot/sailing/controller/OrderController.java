package com.boot.sailing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.sailing.service.OrderService;
import com.boot.sailing.vo.Order;

@Controller
@RequestMapping("/order")
public class OrderController {

  @Autowired
  OrderService orderService;

  @GetMapping("/order")
  public String doOrder (Model model) {
    List<Order> orderList = orderService.getOrderAll();
    model.addAttribute("orderList", orderList);
    return "/order/order";
  }

  @PostMapping("/orderList")
  public String getOrder (Model model,
                          @RequestParam("start_date") String startDate,
                          @RequestParam("end_date") String endDate,
                          @RequestParam("menu_name") String menuName,
                          @RequestParam("cust_name") String custName) {
    List<Order> orderList = orderService.getOrder(startDate, endDate, menuName, custName);
    model.addAttribute("orderList", orderList);
    return "/order/order";
  }
}
