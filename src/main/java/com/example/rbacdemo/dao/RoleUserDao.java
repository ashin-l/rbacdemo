package com.example.rbacdemo.dao;

import com.example.rbacdemo.model.SysRoleUser;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleUserDao {
  int save(SysRoleUser sysRoleUser);
}