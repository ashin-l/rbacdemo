package com.example.rbacdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rbacdemo.model.SysRolePermission;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolePermissionDao {

  SysRolePermission getByRoleId(Long roleId);

  int save(SysRolePermission sysRolePermission);

}