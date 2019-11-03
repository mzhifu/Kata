package com.loonly.kata.gof_test.day1104;

/**
 * @Author: Loonly
 * @Date: 2019/11/4 0:03
 */

public class InnerStaticSingleton {
  
  private InnerStaticSingleton(){}
  
  private static class InnerSingleton {
    static final InnerStaticSingleton innerStaticSingleton = new InnerStaticSingleton();
  }
  
  public static InnerStaticSingleton getInstance() {
    return InnerSingleton.innerStaticSingleton;
  }
}
