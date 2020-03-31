package com.example.rbacdemo.common;

import java.util.List;

import lombok.Data;

@Data
public class Page<T> {

  private Long total;
  private List<T> list;

  public Page(Long total, List<T> list) {
      this.total = total;
      this.list = list;
  }

  public Page(List<T> list) {
      this.list = list;
  }

//  /**
//   *
//   * @param page IPage对象
//   */
//  public static <T> Page resetPage(IPage page)
//  {
//      return new Page(page.getTotal(),page.getRecords());
//  }
}
