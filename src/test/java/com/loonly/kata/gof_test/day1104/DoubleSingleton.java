package com.loonly.kata.gof_test.day1104;

/**
 * @Author: Loonly
 * @Date: 2019/11/3 23:59
 */

public class DoubleSingleton {
  
  private static volatile DoubleSingleton doubleSingleton;
  
  public static DoubleSingleton getInstance() {
    DoubleSingleton result = doubleSingleton;
    if (result == null) {
      synchronized (DoubleSingleton.class) {
        if (result == null) {
          doubleSingleton = result = new DoubleSingleton();
        }
      }
    }
    return doubleSingleton;
  }
}
