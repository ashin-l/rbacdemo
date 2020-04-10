package com.example.rbacdemo.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.rbacdemo.common.PageQuery;
import com.example.rbacdemo.dao.UserDao;
import com.example.rbacdemo.model.SysUser;
import com.example.rbacdemo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  public int save(SysUser user) {
    return userDao.insert(user);
  }

  @Override
  public List<SysUser> getUserList() {
    return userDao.getUserList();
  }

}