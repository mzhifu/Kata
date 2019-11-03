package com.loonly.kata.gof_test.day1031;

/**
 * @Author: Loonly
 * @Date: 2019/11/3 23:11
 */

public class DoubleSingleton {
  
  private volatile static DoubleSingleton doubleSingleton;
  
  public static DoubleSingleton getInstance() {
    DoubleSingleton result = doubleSingleton;
    if (result == null) {
      synchronized (DoubleSingleton.class) {
        if (result == null) {
          doubleSingleton = result = new DoubleSingleton();
        }
      }
    }
    return result;
  }
}
