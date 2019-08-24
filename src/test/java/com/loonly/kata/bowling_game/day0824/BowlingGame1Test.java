package com.loonly.kata.bowling_game.day0824;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * @Author: Loonly
 * @Date: 2019/8/24 22:47
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class BowlingGame1Test {
  
  private Game1 g;
  
  @Before
  public void testSetterGame() {
    g = new Game1();
  }
  
  @Test
  public void testGetterGame() {
    for (int i = 0; i < 20; i++) {
      g.roll(0);
    }
    assertEquals(0, g.score());
  }
  
  @Test
  public void testAllOne() {
    int n = 20;
    int pins = 1;
    for (int i = 0; i < n; i++) {
      g.roll(pins);
    }
    assertEquals(20, g.score());
  }
}
