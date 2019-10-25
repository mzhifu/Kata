package com.loonly.kata.gof.observer;

/**
 * @Author: Loonly
 * @Date: 2019/10/24 23:46
 */

public class ObserverMain {
  
  public static void main(String[] args) {
    
    WetherDataCenter weatherData = new WetherDataCenter();
    
    BaiduWether baiduWether = new BaiduWether(weatherData);
  
    SinaWether sinaWether = new SinaWether(weatherData);
  
    weatherData.setMeasurements(22f, 0.8f, 1.2f);
  }
}
