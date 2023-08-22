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

  /***
   * 메뉴 리스트 조회
   * @return
   */
  public List<Map<String, Object>> getMenu () {
    List<Map<String, Object>> result = menuDao.getMenu();

    log.info(result.toString());

    return result;
  }

  /***
   * 메뉴 신규 추가
   * @param name 메뉴명
   * @param kind 메뉴종류
   * @param price 메뉴가격
   * @return
   */
  public int doMenuInsert(String name, String kind, int price) {
    int result = menuDao.doMenuInsert(name, kind, price);
    return result;
  }

  /***
   * 메뉴 삭제 
   * @param no 메뉴번호
   * @return
   */
  public int doMenuDelete(int no) {
    int result = menuDao.doMenuDelete(no);
    return result;
  }

  /***
   * 메뉴 하나 조회 (수정 시)
   * @param no 메뉴번호
   * @return
   */
  public Map<String, Object> getMenuOne(int no) {
    Map<String, Object> resultMap = new HashMap<>();
    resultMap = menuDao.getMenuOne(no);
    return resultMap;
  }

  /***
   * 메뉴 정보 수정
   * @param no 메뉴번호
   * @param name 메뉴명
   * @param kind 메뉴종류
   * @param price 메뉴가격
   * @return
   */
  public int doMenuUpdate(int no, String name, String kind, int price) {
    int result = menuDao.doMenuUpdate(no, name, kind, price);
    return result;
  }

  public List<Map<String, Object>> getMenu(String startDate, String endDate, String name, String kind) {
    List<Map<String, Object>> list = menuDao.getMenuType(startDate, endDate, name, kind);
    return list;
  }

  public int doMenuPriceUpdate(List<Integer> chkList, Integer price) {
    int result = menuDao.doMenuPriceUpdate(chkList, price);
    int resultLog = menuDao.doMenuPriceInsertLog(chkList, price);
    return result;
  }
}
