package com.loonly.kata.gof.state;

/**
 * @Author: Loonly
 * @Date: 2019/10/25 23:24
 */

public class Dead extends ThreadState {
  
  public Dead() {
    stateName = "死亡状态";
    System.out.println("当前线程处于：死亡状态.");
  }
}
