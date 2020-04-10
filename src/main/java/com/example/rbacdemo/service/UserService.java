package com.example.rbacdemo.service;

import java.util.List;

import com.example.rbacdemo.model.SysUser;

public interface UserService {
  public int save(SysUser user);

  public List<SysUser> getUserList();

}