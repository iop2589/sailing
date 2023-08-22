package com.boot.sailing.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Order {

  /***
   * 주문번호
   */
  private Integer orderNo;

  /***
   * 커피번호
   */
  private Integer coffeeNo;

  /***
   * 메뉴명
   */
  private String menuName;

  /***
   * 가격
   */
  private Integer price;

  /***
   * 고객ID
   */
  private String custId;

  /***
   * 고객명
   */
  private String custName;

  /***
   * 주문일자
   */
  private String orderDate;

}
