package com.loonly.kata.gof.observer;

/**
 * @Author: Loonly
 * @Date: 2019/10/24 0:19
 */

public class BaiduWether implements Observer, DisplayElement {
  
  private float temperature;
  
  private float humidity;
  
  private float pressure;
  
  private WetherDataCenter weatherData = null;
  
  public BaiduWether(WetherDataCenter weatherData){
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  
  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
  
  @Override
  public void display() {
    System.out.println("百度天气：");
    System.out.println("温度：" + temperature + "，湿度" + humidity + "，气压" + pressure);
  }
}
