package com.example.rbacdemo.controller;

import java.util.List;

import com.example.rbacdemo.common.Result;
import com.example.rbacdemo.model.SysRole;
import com.example.rbacdemo.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("role")
public class RoleController {

  @Autowired
  private RoleService roleService;

  @GetMapping("/all")
  public Result getAll() {
    List<SysRole> rolelist = roleService.getAll();
    return Result.ok(rolelist);
  }
}