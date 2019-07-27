package com.loonly.kata.bowling_game.day190727;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * @Author: Loonly
 * @Date: 2019/7/27 10:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BowlingGameTest {
  
  private  Game g;
  
  @Before
  public void setUp(){
    g = new Game();
  }
  
  @Test
  public void testGame(){
    
    int n = 20;
    int pins = 0;
    rollMany(20, 0);
    assertEquals(0, g.score());
  }
  
  private void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++) {
      g.roll(pins);
    }
  }
  
  @Test
  public void testAllOnes(){
    rollMany(20, 1);
  
    assertEquals(20, g.score());
  }
  
  @Test
  public void testOneSpare(){
    g.roll(5);
    g.roll(5); //spare
    g.roll(3);
    rollMany(17, 0);
    
    assertEquals(16, g.score());
  }
  
  @Test
  public void testOneStrike() throws Exception {
    rollStrike();
    g.roll(3);
    g.roll(4);
    rollMany(16, 0);
    assertEquals(24, g.score());
  }
  
  @Test
  public void testPerfectGame() throws Exception {
    rollMany(12,10);
    assertEquals(300, g.score());
  }
  
  private void rollStrike() {
    g.roll(10);
  }
  
  private void rollSpare() {
    g.roll(5);
    g.roll(5);
  }
  
}
