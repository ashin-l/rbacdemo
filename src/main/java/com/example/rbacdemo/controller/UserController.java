package com.example.rbacdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

  @GetMapping("/info/{username}")
  @ResponseBody
  public String userInfo(@PathVariable String username, @RequestParam String password) {
    return username + " " + password;
  }
}