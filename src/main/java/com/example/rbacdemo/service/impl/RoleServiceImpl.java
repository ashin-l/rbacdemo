package com.example.rbacdemo.service.impl;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.rbacdemo.common.PageQuery;
import com.example.rbacdemo.dao.RoleDao;
import com.example.rbacdemo.model.SysRole;
import com.example.rbacdemo.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

  @Autowired
  private RoleDao roleDao;

  @Override
  public List<SysRole> getAll() {
    return roleDao.selectList(null);
  }

  @Override
  public SysRole getById(Long roleid) {
    return roleDao.getById(roleid);
  }

}