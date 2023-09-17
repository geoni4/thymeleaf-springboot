package com.geoni4.blog.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  // @GetMapping("/hello")
  // @ResponseBody
  // public Map<String, Object> hello() {
  //   Map<String, Object> hello = new HashMap<>();
  //   hello.put("hello1", "hello1");
  //   hello.put("hello2", "hello2");
  //   return hello;
  // }

  @GetMapping("/")
  public String hello() {
    return "hello";
  }

}
