package com.loonly.kata.bowling_game.day0729;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * @Author: Loonly
 * @Date: 2019/7/29 23:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BowlingGame2Test {
  
  private Game2 g;
  
  @Before
  public void setGame2(){
    g = new Game2();
  }
  
  @Test
  public void testGetter(){
    rollMany(20, 0);
    assertEquals(0, g.score());
  }
  
  @Test
  public void testAllOnes(){
    rollMany(20, 1);
    assertEquals(20, g.score());
  }
  
  private void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++) {
      g.roll(pins);
    }
  }
  
  @Test
  public void testOneSpare(){
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
  public void testOneStrike(){
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
  public void testPerfectGame(){
    rollMany(12, 10);
    assertEquals(300, g.score());
    
  }
}
