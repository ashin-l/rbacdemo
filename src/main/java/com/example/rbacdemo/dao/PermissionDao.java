package com.example.rbacdemo.dao;

import com.example.rbacdemo.model.SysPermission;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionDao {

  public SysPermission getById(int id);

}