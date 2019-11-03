package com.loonly.kata.gof_test.day1031;

/**
 * @Author: Loonly
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
