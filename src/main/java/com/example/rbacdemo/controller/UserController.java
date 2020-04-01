package com.example.rbacdemo.controller;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.rbacdemo.common.PageQuery;
import com.example.rbacdemo.common.RPage;
import com.example.rbacdemo.common.Result;
import com.example.rbacdemo.dto.UserInfo;
import com.example.rbacdemo.model.SysRoleUser;
import com.example.rbacdemo.model.SysUser;
import com.example.rbacdemo.service.RoleUserService;
import com.example.rbacdemo.service.UserService;
import com.example.rbacdemo.util.MD5;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

  @Autowired
  private UserService userService;
  @Autowired
  private RoleUserService roleuserService;

  @GetMapping("/info/{username}")
  @ResponseBody
  public String userInfo(@PathVariable String username, @RequestParam String password) {
    return username + " " + password;
  }

  @RequestMapping("/list")
  @ResponseBody
  public Result userList(UserInfo userInfo, PageQuery pageQuery) {
    System.out.println(userInfo);
    System.out.println(pageQuery);
    IPage<SysUser> userlist = userService.getUserList(pageQuery);
    return Result.ok(RPage.resetPage(userlist));
  }

  // public Result userList(@RequestParam int page, @RequestParam int limit) {
  // System.out.println(page);
  // System.out.println(limit);
  // int offset = (page -1) * limit;
  // List<SysUser> userlist = userService.getUserList(limit, offset);
  // Long total = userService.getTotal();
  // Page<SysUser> p = new Page<SysUser>(total, userlist);
  // return Result.ok(p);
  // }

  @PostMapping("/add")
  @ResponseBody
  public Result addUser(@RequestBody Map params) {
    System.out.println(params);
    SysUser user = new SysUser();
    user.setUsername((String) params.get("username"));
    user.setPassword(MD5.crypt((String) params.get("password")));
    System.out.println(user);
    userService.save(user);
    if (params.get("roleid") != null) {
      SysRoleUser roleuser = new SysRoleUser();
      roleuser.setRoleId(Long.valueOf(String.valueOf(params.get("roleid"))));
      roleuser.setUserId(user.getId());
      roleuserService.addRoleUser(roleuser);
    }
    return Result.ok();
  }

  @PostMapping("/update")
  @ResponseBody
  public Result updateUser(@RequestBody UserInfo userInfo) {
    System.out.println(userInfo);
    SysUser user = new SysUser();
    user.setId(userInfo.getId());
    user.setUsername(userInfo.getUsername());
    userService.update(user);
    return Result.ok();
  }
}