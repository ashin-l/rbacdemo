package com.example.rbacdemo.service.impl;

import com.example.rbacdemo.dao.PermissionDao;
import com.example.rbacdemo.dao.UserDao;
import com.example.rbacdemo.dto.LoginUser;
import com.example.rbacdemo.model.SysUser;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  private UserDao userDao;
  @Autowired
  private PermissionDao permissionDao;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    SysUser sysUser = userDao.getUser(username);
    System.out.println(sysUser);
    if(sysUser == null) {
      throw new AuthenticationCredentialsNotFoundException("用户名不存在！");
    }

    var loginUser = new LoginUser();
    BeanUtils.copyProperties(sysUser, loginUser);
    loginUser.setPermissions(permissionDao.listByUserId(sysUser.getId()));
    return loginUser;
  }

}