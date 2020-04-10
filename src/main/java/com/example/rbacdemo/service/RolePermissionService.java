package com.example.rbacdemo.service;

import com.example.rbacdemo.model.SysRolePermission;

public interface RolePermissionService {

  SysRolePermission getByRoleid(Long roleid);
  int save(SysRolePermission sysRolePermission);
}