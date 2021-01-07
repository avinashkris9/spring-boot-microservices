package com.github.avinashkris9.microservices.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {


  @GetMapping("/id")
  public String helloWorld()
  {
    return
        "Hello World";
  }

}
