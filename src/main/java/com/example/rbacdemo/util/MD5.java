package com.example.rbacdemo.util;

import org.springframework.util.DigestUtils;

public class MD5 {

  public static String crypt(String str) {
    return DigestUtils.md5DigestAsHex(str.getBytes());
  }
}