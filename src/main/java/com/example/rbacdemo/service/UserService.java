package com.example.rbacdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.rbacdemo.common.PageQuery;
import com.example.rbacdemo.model.SysUser;

public interface UserService {
  public int save(SysUser user);

  public IPage<SysUser> getUserList(PageQuery pageQuery);

  public Integer getTotal();

  public void update(SysUser user);
}