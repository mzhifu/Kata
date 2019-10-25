package com.loonly.kata.gof.observer;


public interface Subject {
  
  void registerObserver(Observer o);
  
  void removeObserver(Observer o);
  
  void notifyObserver();
  
}
