package com.example.rbacdemo.dao;

import java.util.List;

import com.example.rbacdemo.model.SysRole;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleDao {

  public SysRole getById(Long id);

  public List<SysRole> getAll();

}