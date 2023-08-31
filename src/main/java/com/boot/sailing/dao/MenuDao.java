package com.boot.sailing.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.boot.sailing.vo.CoffeeMenu;

@Mapper
public interface MenuDao {
  /***
   * 메뉴 리스트 조회
   * @return
   */
  List<CoffeeMenu> getMenu();

  /***
   * 메뉴 신규 추가
   * @param name 메뉴명
   * @param kind 메뉴종류
   * @param price 메뉴가격
   * @return
   */
  int doMenuInsert(CoffeeMenu coffeeMenu);

  /***
   * 메뉴 삭제
   * @param no 메뉴번호
   * @return
   */
  int doMenuDelete(CoffeeMenu coffeeMenu);

  /***
   * 메뉴 하나 정보 조회 (수정 시)
   * @param no 메뉴번호
   * @return
   */
  CoffeeMenu getMenuOne(CoffeeMenu coffeeMenu);

  /***
   * 메뉴 정보 수정
   * @param no 메뉴번호
   * @param name 메뉴명
   * @param kind 메뉴종류
   * @param price 메뉴가격
   * @return
   */
  int doMenuUpdate(CoffeeMenu coffeeMenu);

  /***
   * 메뉴 조회 (with 조건)
   * @param startDate 등록시작일자
   * @param endDate 등록종료일자
   * @param name 메뉴명칭
   * @param kind 메뉴종류
   * @return
   */
  List<CoffeeMenu> getMenuType(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("name") String name, @Param("kind") String kind);

  /***
   * 메뉴 가격 변경
   * @param chkList 메뉴번호 리스트
   * @param price 변경가격
   * @return
   */
  int doMenuPriceUpdate(@Param("chkList") List<Integer> chkList, @Param("price") Integer price);

  /***
   * 메뉴 가격 변경 로그
   * @param chkList 메뉴번호리스트
   * @param price 변경가격
   * @return
   */
  int doMenuPriceInsertLog(@Param("chkList") List<Integer> chkList, @Param("price") Integer price);

  /***
   * Error Log
   * @param string
   */
  void bootLog(@Param("error") String error);
}
