package com.loonly.kata.gof_test.day1101;

/**
 * @Author: Loonly
 * @Date: 2019/11/3 23:37
 */

public class LazySingleton {
  
  private static LazySingleton lazySingleton;
  
  private LazySingleton() {
  
  }
  
  public static synchronized LazySingleton getInstance() {
    if (lazySingleton == null) {
      lazySingleton = new LazySingleton();
    }
    return lazySingleton;
  }
}
