package com.example.rbacdemo.service;

import java.util.List;

import com.example.rbacdemo.model.SysRole;

public interface RoleService {

  List<SysRole> getAll();
  SysRole getById(Long roleid);

}