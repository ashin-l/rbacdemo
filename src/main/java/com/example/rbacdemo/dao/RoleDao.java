package com.example.rbacdemo.dao;

import java.util.List;

import com.example.rbacdemo.model.SysRole;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleDao {

  List<SysRole> getAll();

  SysRole getById(Long roleid);

  public List<SysRole> findByCondition(SysRole sysRole);
}