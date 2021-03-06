package com.example.rbacdemo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.rbacdemo.common.PageQuery;
import com.example.rbacdemo.common.RPage;
import com.example.rbacdemo.common.Result;
import com.example.rbacdemo.form.AddRoleForm;
import com.example.rbacdemo.model.SysRole;
import com.example.rbacdemo.model.SysRolePermission;
import com.example.rbacdemo.service.RolePermissionService;
import com.example.rbacdemo.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("role")
public class RoleController {

  @Autowired
  private RoleService roleService;
  @Autowired
  private RolePermissionService rolePermissionService;

  @GetMapping("/all")
  public Result getAll() {
    List<SysRole> rolelist = roleService.getAll();
    return Result.ok(rolelist);
  }

  @GetMapping("/info")
  public Result getInfo(Long roleid) {
    SysRole sysRole = roleService.getById(roleid);
    Map<String, Object> map = new HashMap<String, Object>();
    SysRolePermission sysRolePermission = rolePermissionService.getByRoleid(roleid);
    System.out.println(sysRolePermission);
    map.put("permissionId", sysRolePermission.getPermissionId());
    return Result.ok(map);
  }

  @PostMapping("/add")
  public Result addRole(@RequestBody AddRoleForm form) {
    SysRolePermission sysRolePermission = new SysRolePermission();
    sysRolePermission.setRoleId(form.getRoleId());
    sysRolePermission.setPermissionId(form.getPermissionId());
    System.out.println(sysRolePermission);
    rolePermissionService.save(sysRolePermission);
    return Result.ok();
  }
}