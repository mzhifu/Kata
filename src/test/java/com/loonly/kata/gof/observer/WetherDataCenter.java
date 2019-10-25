package com.loonly.kata.gof.observer;

import lombok.Data;

import java.util.ArrayList;

/**
 * @Author: Loonly
 * @Date: 2019/10/24 0:17
 */
@Data
public class WetherDataCenter implements Subject{
  
  private ArrayList observers;
  private float temperature; //温度
  private float humidity;    //湿度
  private float pressure;    //气压
  
  public WetherDataCenter(){
    observers = new ArrayList();
  }
  
  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }
  
  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObserver() {
    for(int i = 0;i < observers.size();i++){
      Observer observer = (Observer) observers.get(i);
      observer.update(temperature,humidity,pressure);
    }
  }
  
  public void measurementsChanged(){
    notifyObserver();
  }
  
  public void setMeasurements(float temperature,float humidity,float pressure){
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}
