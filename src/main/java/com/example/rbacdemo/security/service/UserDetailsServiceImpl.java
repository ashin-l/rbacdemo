package com.example.rbacdemo.security.service;

import com.example.rbacdemo.dao.PermissionDao;
import com.example.rbacdemo.dao.UserDao;
import com.example.rbacdemo.model.SysUser;
import com.example.rbacdemo.security.entity.JwtUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * @author shuang.kou
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        SysUser user = userDao.getUser(name);
        return new JwtUser(user);
    }

}
