package com.loonly.kata.gof_test.day1102;

/**
 * @Author: Loonly
 * @Date: 2019/11/3 23:41
 */

public class InnerStaticSingleton {
  
  private static class InnerSingleton {
    static final InnerStaticSingleton innerStaticSingleton = new InnerStaticSingleton();
  }
  
  public static InnerStaticSingleton getInstance() {
    return InnerSingleton.innerStaticSingleton;
  }
}
