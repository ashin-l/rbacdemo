package com.example.rbacdemo.model;

import lombok.Data;

@Data
public class SysRole {

  private Long id;
  private String name;
  private String description;
  private Integer creatTime;
  private Integer updateTime;

}