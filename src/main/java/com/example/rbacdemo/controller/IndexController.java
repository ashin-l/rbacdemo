package com.example.rbacdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class IndexController {

  @GetMapping("/hi")
  public String hi() {
    log.info("Hello World");
    return "hi man";
  }
}