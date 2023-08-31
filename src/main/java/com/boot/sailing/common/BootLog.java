package com.boot.sailing.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.boot.sailing.dao.MenuDao;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class BootLog {
  @Autowired
  MenuDao menuDao;

  public void bootLog(String error) {
    menuDao.bootLog(error);
  }
}
