package com.springboot;

public class TestMain {

  public static void main(String[] args) {
    Runnable runnable = () -> System.out.println("hi - using lamda");
    runnable.run();
  }
}
