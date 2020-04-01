package com.example.rbacdemo.service;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.rbacdemo.common.PageQuery;
import com.example.rbacdemo.model.SysUser;

public interface UserService {
  public int save(SysUser user);

  public IPage<SysUser> getUserList(PageQuery pageQuery);

  public Long getTotal();

  public void update(SysUser user);
}