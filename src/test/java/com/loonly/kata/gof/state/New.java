package com.loonly.kata.gof.state;

/**
 * @Author: Loonly
 * @Date: 2019/10/25 23:23
 */

public class New extends ThreadState {
  
  public New() {
    stateName = "新建状态";
    System.out.println("当前线程处于：新建状态.");
  }
  
  public void start(ThreadContext threadContext) {
    System.out.print("调用start()方法-->");
    if (stateName.equals("新建状态")) {
      threadContext.setState(new Runnable());
    } else {
      System.out.println("当前线程不是新建状态，不能调用start()方法.");
    }
  }
}
