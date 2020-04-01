package com.example.rbacdemo.common;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;

import lombok.Data;

@Data
public class RPage<T> {

  private Long total;
  private List<T> list;

  public RPage(Long total, List<T> list) {
      this.total = total;
      this.list = list;
  }

  public RPage(List<T> list) {
      this.list = list;
  }

  /**
   *
   * @param page IPage对象
   */
  public static <T> RPage resetPage(IPage page)
  {
      return new RPage(page.getTotal(),page.getRecords());
  }
}
