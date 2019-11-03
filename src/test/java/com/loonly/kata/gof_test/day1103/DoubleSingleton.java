package com.loonly.kata.gof_test.day1103;

/**
 * @Author: Loonly
 * @Date: 2019/11/3 23:50
 */

public class DoubleSingleton {
  
  private DoubleSingleton(){}
  
  private static volatile DoubleSingleton doubleSingleton;
  
  public static DoubleSingleton getInstance() {
    DoubleSingleton result = doubleSingleton;
    if (result == null) {
      synchronized (DoubleSingleton.class) {
        if (result == null ) {
          doubleSingleton = result = new DoubleSingleton();
        }
      }
    }
    return result;
  }
}
