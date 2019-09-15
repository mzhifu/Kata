package com.loonly.kata.bowling_game.bowlinggame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: Loonly
 * @Date: 2019/9/15 21:07
 */

public class BowlingGame0910 {
  
  private Game0910 g;
  
  @Before
  public void SetterGame() {
    g = new Game0910();
  }
  
  @Test
  public void testGetter() {
    rollMany(20, 0);
    assertEquals(0, g.score());
  }
  
  @Test
  public void testAllOnes() {
    int n = 20;
    int pins = 1;
    rollMany(n, pins);
    assertEquals(20, g.score());
  }
  
  private void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++) {
      g.roll(pins);
    }
  }
  
  @Test
  public void OneSpare() {
    rollSpare();
    g.roll(3);
    rollMany(17, 0);
    assertEquals(16, g.score());
  }
  
  private void rollSpare() {
    g.roll(5);
    g.roll(5);
  }
  
  @Test
  public void testOneStrike() {
    rollStrike();
    g.roll(3);
    g.roll(4);
    rollMany(16, 0);
    assertEquals(24, g.score());
  }
  
  private void rollStrike() {
    g.roll(10);
  }
}
