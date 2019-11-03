package com.loonly.kata.gof_test.day1101;

/**
 * @Author: Loonly
 * @Date: 2019/11/3 23:21
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
