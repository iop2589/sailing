package com.boot.sailing.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.sailing.dao.MenuDao;
import com.boot.sailing.vo.CoffeeMenu;
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
  public List<CoffeeMenu> getMenu () {
    List<CoffeeMenu> result = menuDao.getMenu();

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
  public int doMenuInsert(CoffeeMenu coffeeMenu) {
    int result = menuDao.doMenuInsert(coffeeMenu);
    return result;
  }

  /***
   * 메뉴 삭제 
   * @param no 메뉴번호
   * @return
   */
  public int doMenuDelete(CoffeeMenu coffeeMenu) {
    int result = menuDao.doMenuDelete(coffeeMenu);
    return result;
  }

  /***
   * 메뉴 하나 조회 (수정 시)
   * @param no 메뉴번호
   * @return
   */
  public CoffeeMenu getMenuOne(CoffeeMenu coffeeMenu) {
    CoffeeMenu coffeeMenuResult = menuDao.getMenuOne(coffeeMenu);
    return coffeeMenuResult;
  }

  /***
   * 메뉴 정보 수정
   * @param no 메뉴번호
   * @param name 메뉴명
   * @param kind 메뉴종류
   * @param price 메뉴가격
   * @return
   */
  public int doMenuUpdate(CoffeeMenu coffeeMenu) {
    int result = menuDao.doMenuUpdate(coffeeMenu);
    return result;
  }

  /***
   * 메뉴 검색
   * @param startDate 시작일자
   * @param endDate 종료일자
   * @param name 메뉴명칭
   * @param kind 메뉴종류
   * @return
   */
  public List<CoffeeMenu> getMenu(String startDate, String endDate, String name, String kind) {
    List<CoffeeMenu> list = menuDao.getMenuType(startDate, endDate, name, kind);
    return list;
  }

  /***
   * 메뉴 가격 일괄 변경
   * @param chkList 메뉴번호 리스트
   * @param price 변경 가격
   * @return
   */
  public int doMenuPriceUpdate(List<Integer> chkList, Integer price) {
    int result = menuDao.doMenuPriceUpdate(chkList, price);
    int resultLog = menuDao.doMenuPriceInsertLog(chkList, price);
    return result;
  }
}
