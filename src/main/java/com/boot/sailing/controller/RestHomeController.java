package com.boot.sailing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {
  @GetMapping("/home/rest")
  public String doRest () {
    String strHtml = "<html><body>Hi Rest</body></html>";
    return strHtml;
  }
}
