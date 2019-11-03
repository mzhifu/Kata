package com.loonly.kata.gof_test.day1103;

/**
 * @Author: Loonly
 * @Date: 2019/11/3 23:56
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
