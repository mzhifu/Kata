package com.loonly.kata.gof.state;

/**
 * @Author: Loonly
 * @Date: 2019/10/25 23:23
 */

public class Runnable extends ThreadState {
  
  public Runnable() {
    stateName = "就绪状态";
    System.out.println("当前线程处于：就绪状态.");
  }
  
  public void getCPU(ThreadContext threadContext) {
    System.out.print("获得CPU时间-->");
    if (stateName.equals("就绪状态")) {
      threadContext.setState(new Running());
    } else {
      System.out.println("当前线程不是就绪状态，不能获取CPU.");
    }
  }
}
