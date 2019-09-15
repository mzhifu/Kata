package com.loonly.kata.bowling_game.bowlinggame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: Loonly
 * @Date: 2019/9/15 21:25
 */

public class BowlingGame0915 {
  
  private Game0915 g;
  
  @Before
  public void setUp() throws Exception {
    g = new Game0915();
  }
  
  @Test
  public void testGetterGame() {
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
  public void testOneSpare() {
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
  
  @Test
  public void perfectGame() {
    rollMany(12, 10);
    assertEquals(300, g.score());
  }
}
