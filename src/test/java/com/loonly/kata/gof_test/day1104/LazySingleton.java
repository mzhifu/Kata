package com.loonly.kata.gof_test.day1104;

/**
 * @Author: Loonly
 * @Date: 2019/11/4 0:00
 */

public class LazySingleton {
  
  private static LazySingleton lazySingleton;
  
  private LazySingleton(){
  }
  
  public static synchronized LazySingleton getInstance() {
    if (lazySingleton  == null) {
      lazySingleton = new LazySingleton();
    }
    return lazySingleton;
  }
}
