package com.boot.sailing.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.boot.sailing.vo.Member;

@Mapper
public interface MemberDao {

  List<Member> getMemberAll();

  List<Member> getMember(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("custName") String custName);
  
}
