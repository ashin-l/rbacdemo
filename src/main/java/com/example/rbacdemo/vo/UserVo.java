package com.example.rbacdemo.vo;

import com.example.rbacdemo.model.SysUser;

import lombok.Data;

@Data
public class UserVo extends SysUser {
  private String rolename;
}