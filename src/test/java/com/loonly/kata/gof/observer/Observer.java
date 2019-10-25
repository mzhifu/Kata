package com.loonly.kata.gof.observer;

/**
 * @Author: Loonly
 * @Date: 2019/10/24 0:16
 */

public interface Observer {
  
  void update(float temp,float humidity,float pressure);
}
