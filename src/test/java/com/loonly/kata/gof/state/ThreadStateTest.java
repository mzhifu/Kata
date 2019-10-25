package com.loonly.kata.gof.state;

/**
 * @Author: Loonly
 * @Date: 2019/10/25 23:25
 */

public class ThreadStateTest {
  
  public static void main(String[] args) {
    ThreadContext context = new ThreadContext();
    context.start();
    context.getCPU();
    context.suspend();
    context.resume();
    context.getCPU();
    context.stop();
  }
}
