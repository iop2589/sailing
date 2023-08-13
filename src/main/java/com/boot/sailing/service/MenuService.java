package com.boot.sailing.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.sailing.dao.MenuDao;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class MenuService {

  @Autowired
  MenuDao menuDao;

  public MenuService() {
    log.info("============ Menu Service, 생성자 =================");
  }

  public List<Map<String, Object>> getMenu () {
    List<Map<String, Object>> result = menuDao.getMenu();

    log.info(result.toString());

    return result;
  }
}
