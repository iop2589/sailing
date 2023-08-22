package com.boot.sailing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.sailing.service.MemberService;
import com.boot.sailing.vo.Member;

@Controller
@RequestMapping("/member")
public class MemberController {

  @Autowired
  MemberService memberService;

  @GetMapping("/member")
  public String doMember (Model model) {
    List<Member> memberList = memberService.getMemberAll();
    model.addAttribute("memberList", memberList);
    return "/member/member";
  }

  @PostMapping("/memberList")
  public String getMemberList (Model model, 
                              @RequestParam("start_date") String startDate, 
                              @RequestParam("end_date") String endDate,
                              @RequestParam("cust_name") String custName) {
    List<Member> memberList = memberService.getMember(startDate, endDate, custName);
    model.addAttribute("memberList", memberList);            
    return "/member/member";
  }
}
