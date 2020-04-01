package com.example.rbacdemo.dto;

import lombok.Data;

@Data
public class UserInfo {
  private Long id;
  private String username;
  private String password;
  private int roleid;
}