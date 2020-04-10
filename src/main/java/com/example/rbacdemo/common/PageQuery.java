package com.example.rbacdemo.common;

import lombok.Data;

@Data
public class PageQuery {
  private int currentPage;
  private int pageSize;
}