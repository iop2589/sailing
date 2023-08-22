package com.boot.sailing.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Member {
  /***
   * 고객번호
   */
  private Integer no;

  /***
   * 고객ID
   */
  private String custId;

  /***
   * 고객명
   */
  private String name;

  /***
   * 고객 이메일
   */
  private String email;

  /***
   * 고객 권한
   */
  private String role;

  /***
   * 등록일자
   */
  private String regDay;
}
