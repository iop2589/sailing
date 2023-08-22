package com.boot.sailing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.sailing.dao.OrderDao;
import com.boot.sailing.vo.Order;

@Service
public class OrderService {

  @Autowired
  OrderDao orderDao;

  public List<Order> getOrderAll() {
    return orderDao.getOrderAll();
  }

  public List<Order> getOrder(String startDate, String endDate, String menuName, String custName) {
    return orderDao.getOrder(startDate, endDate, menuName, custName);
  }
  
}
