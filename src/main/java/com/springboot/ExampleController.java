package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ExampleController {

  @Autowired
  private SingletonService singletonService;

  @GetMapping("/v1/example")
  public List<String> getMethod() throws InterruptedException {
    String first = singletonService.getMethod();
    Thread.sleep(1000);
    String second = singletonService.getMethod();
    return Arrays.asList(first, second);
  }
}
