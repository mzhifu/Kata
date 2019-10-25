package com.loonly.kata.gof.state;

import lombok.Data;

/**
 * @Author: Loonly
 * @Date: 2019/10/25 23:21
 */
@Data
public class ThreadContext {
  
  private ThreadState state;
  
  ThreadContext() {
    state = new New();
  }
  
  public void start() {
    ((New) state).start(this);
  }
  
  public void getCPU() {
    ((Runnable) state).getCPU(this);
  }
  
  public void suspend() {
    ((Running) state).suspend(this);
  }
  
  public void stop() {
    ((Running) state).stop(this);
  }
  
  public void resume() {
    ((Blocked) state).resume(this);
  }
}
