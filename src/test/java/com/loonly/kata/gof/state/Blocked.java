package com.loonly.kata.gof.state;

/**
 * @Author: Loonly
 * @Date: 2019/10/25 23:24
 */

public class Blocked extends ThreadState {
  
  public Blocked() {
    stateName = "阻塞状态";
    System.out.println("当前线程处于：阻塞状态.");
  }
  
  public void resume(ThreadContext threadContext) {
    System.out.print("调用resume()方法-->");
    if (stateName.equals("阻塞状态")) {
      threadContext.setState(new Runnable());
    } else {
      System.out.println("当前线程不是阻塞状态，不能调用resume()方法.");
    }
  }
}
