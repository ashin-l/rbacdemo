package com.example.rbacdemo.form;

import lombok.Data;

@Data
public class AddRoleForm {
  private Long roleId;
  private Integer[] permissionId;
}