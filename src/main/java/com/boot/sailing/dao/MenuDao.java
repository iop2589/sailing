package com.boot.sailing.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MenuDao {
  /***
   * 메뉴 리스트 조회
   * @return
   */
  List<Map<String, Object>> getMenu();

  /***
   * 메뉴 신규 추가
   * @param name 메뉴명
   * @param kind 메뉴종류
   * @param price 메뉴가격
   * @return
   */
  int doMenuInsert(@Param("name") String name, @Param("kind") String kind, @Param("price") int price);

  /***
   * 메뉴 삭제
   * @param no 메뉴번호
   * @return
   */
  int doMenuDelete(@Param("no") int no);

  /***
   * 메뉴 하나 정보 조회 (수정 시)
   * @param no 메뉴번호
   * @return
   */
  Map<String, Object> getMenuOne(@Param("no")int no);

  /***
   * 메뉴 정보 수정
   * @param no 메뉴번호
   * @param name 메뉴명
   * @param kind 메뉴종류
   * @param price 메뉴가격
   * @return
   */
  int doMenuUpdate(@Param("no") int no, @Param("name") String name, @Param("kind") String kind, @Param("price") int price);

  List<Map<String, Object>> getMenuType(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("name") String name, @Param("kind") String kind);

  int doMenuPriceUpdate(@Param("no") Integer no, @Param("price") Integer price);

  int doMenuPriceInsertLog(@Param("no") Integer no, @Param("price") Integer price);
}
