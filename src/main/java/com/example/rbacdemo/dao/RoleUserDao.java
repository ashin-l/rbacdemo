package com.example.rbacdemo.dao;

import com.example.rbacdemo.model.SysRoleUser;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleUserDao {

  public SysRoleUser getByUserId(Long userId);

  public void addRoleUser(SysRoleUser roleuser);

}