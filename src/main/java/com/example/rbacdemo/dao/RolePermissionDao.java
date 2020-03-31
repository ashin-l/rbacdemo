package com.example.rbacdemo.dao;

import com.example.rbacdemo.model.SysRolePermission;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolePermissionDao {

  public SysRolePermission getByRoleId(Long roleId);

}