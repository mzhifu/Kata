package com.loonly.kata.gof.state;

/**
 * @Author: Loonly
 * @Date: 2019/10/25 23:24
 */

public class Running extends ThreadState {
  
  public Running() {
    stateName = "运行状态";
    System.out.println("当前线程处于：运行状态.");
  }
  
  public void suspend(ThreadContext threadContext) {
    System.out.print("调用suspend()方法-->");
    if (stateName.equals("运行状态")) {
      threadContext.setState(new Blocked());
    } else {
      System.out.println("当前线程不是运行状态，不能调用suspend()方法.");
    }
  }
  
  public void stop(ThreadContext threadContext) {
    System.out.print("调用stop()方法-->");
    if (stateName.equals("运行状态")) {
      threadContext.setState(new Dead());
    } else {
      System.out.println("当前线程不是运行状态，不能调用stop()方法.");
    }
  }
}
