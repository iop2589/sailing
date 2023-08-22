package com.boot.sailing.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.boot.sailing.vo.Order;

@Mapper
public interface OrderDao {

  List<Order> getOrderAll();

  List<Order> getOrder(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("menuName") String menuName, @Param("custName") String custName);
  
}
