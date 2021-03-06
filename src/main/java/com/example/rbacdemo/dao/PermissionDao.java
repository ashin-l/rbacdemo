package com.example.rbacdemo.dao;

import java.util.List;

import com.example.rbacdemo.model.SysPermission;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionDao {

  SysPermission getById(int id);
  List<SysPermission> listByUserId(Long userId);

}