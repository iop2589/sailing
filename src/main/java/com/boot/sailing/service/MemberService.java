package com.boot.sailing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.sailing.dao.MemberDao;
import com.boot.sailing.vo.Member;

@Service
public class MemberService {

  @Autowired
  MemberDao memberDao;

  public List<Member> getMemberAll() {
    return memberDao.getMemberAll();
  }

  public List<Member> getMember(String startDate, String endDate, String custName) {
    return memberDao.getMember(startDate, endDate, custName);
  }
  
}
