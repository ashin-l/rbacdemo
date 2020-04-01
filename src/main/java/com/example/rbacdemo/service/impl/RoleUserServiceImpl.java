package com.example.rbacdemo.service.impl;

import com.example.rbacdemo.dao.RoleUserDao;
import com.example.rbacdemo.model.SysRoleUser;
import com.example.rbacdemo.service.RoleUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleUserServiceImpl implements RoleUserService {

  @Autowired
  private RoleUserDao roleuserDao;

  @Override
  public void addRoleUser(SysRoleUser roleuser) {
    roleuserDao.insert(roleuser);
  }

}