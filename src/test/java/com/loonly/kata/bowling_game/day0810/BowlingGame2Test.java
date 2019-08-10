package com.loonly.kata.bowling_game.day0810;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * @Author: Loonly
 * @Date: 2019/8/10 19:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BowlingGame2Test {
  
  private Game2 g;
  
  @Before
  public void testSetterGame() {
    g = new Game2();
  }
  
  @Test
  public void testGetterGame() {
    rollMany(20, 0);
    assertEquals(0, g.score());
  }
  
  @Test
  public void testAllOne() {
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
  public void test() {
  
  }
}
