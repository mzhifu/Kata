package com.loonly.kata.gof_test.day1102;

/**
 * @Author: Loonly
 * @Date: 2019/11/3 23:38
 */

public class DoubleSingleton {
  
  private DoubleSingleton() {}

  private volatile static DoubleSingleton doubleSingleton;
  
  public static DoubleSingleton getInstance() {
    DoubleSingleton result = doubleSingleton;
    if (result == null) {
      synchronized (DoubleSingleton.class) {
        doubleSingleton = result = new DoubleSingleton();
      }
    }
    return result;
  }
}
