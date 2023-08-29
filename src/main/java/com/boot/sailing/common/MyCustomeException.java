package com.boot.sailing.common;

public class MyCustomeException extends Exception {

  public MyCustomeException (String message, String errorRoute) {
    super("에러메세지 : " + message + "\n 에러위치 : " + errorRoute);
  }
}
