package com.example.rbacdemo.dto;

import lombok.Data;

@Data
public class UserInfo {
  private Integer id;
  private String username;
  private String password;
  private int roleid;
}