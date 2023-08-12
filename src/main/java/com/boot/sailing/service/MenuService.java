package com.boot.sailing.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class MenuService {

  public MenuService() {
    log.info("============ Menu Service, 생성자 =================");
  }

  public List<Map<String, Object>> getMenu () {
    List<Map<String, Object>> result = new ArrayList<>();

    Map<String, Object> map = new HashMap<>();
    map.put("no", 1);
    map.put("name", "아이스아메리카노");
    map.put("kind", "커피");
    map.put("price", "5,000");
    map.put("reg_day", "2020.10.29");
    map.put("mod_day", "2020.10.29");
    result.add(map);

    Map<String, Object> map1 = new HashMap<>();
    map1.put("no", 2);
    map1.put("name", "아이스카페라떼");
    map1.put("kind", "커피");
    map1.put("price", "6,000");
    map1.put("reg_day", "2020.10.31");
    map1.put("mod_day", "2020.10.31");
    result.add(map1);

    log.info(result.toString());

    return result;
  }
}
