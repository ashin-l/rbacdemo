package com.example.rbacdemo.service;

import java.util.List;

import com.example.rbacdemo.model.SysUser;

public interface UserService {

  int save(SysUser user);

  List<SysUser> getUserList();

  int update(SysUser user);

}