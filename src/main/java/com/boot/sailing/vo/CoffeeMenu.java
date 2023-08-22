package com.boot.sailing.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CoffeeMenu {

  /***
   * 메뉴번호
   */
  @JsonProperty(value="no")
  private Integer no;

  /***
   * 메뉴명
   */
  @JsonProperty(value="name")
  private String name;

  /***
   * 메뉴종류
   */
  @JsonProperty(value="kind")
  private String kind;

  /***
   * 메뉴가격
   */
  @JsonProperty(value="price")
  private Integer price;

  /***
   * 등록일자
   */
  private String regDay;

  /***
   * 수정일자
   */
  private String modDay;

}
