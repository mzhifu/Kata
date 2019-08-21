package com.loonly.kata.bowling_game.day0820;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


/**
 * @Author: Loonly
 * @Date: 2019/8/21 22:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BowlingGame3Test {
  
  private Game3 g;
  
  @Before
  public void testSetterGame() {
    g = new Game3();
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
  public void testPerfectGame() {
    rollMany(12, 10);
    assertEquals(300, g.score());
  }
}
class Game3 {
  
  private int[] arrays = new int[21];
  
  private int currentRoll = 0;
  
  public void roll(int pins) {
    arrays[currentRoll++] = pins;
  }
  
  public int score() {
    int score = 0;
    int frameIndex = 0;
    for (int i = 0; i < 10; i++) {
      if (isStrike(frameIndex)) {
        score += 10 + strikeBonus(frameIndex);
        frameIndex ++;
      } else if (isSpare(frameIndex)) {
        score += 10 + spareBonus(frameIndex);
        frameIndex += 2;
      } else {
        score += sum(frameIndex);
        frameIndex ++;
      }
    }
    return score;
  }
  
  private int sum(int frameIndex) {
    return arrays[frameIndex] + arrays[frameIndex + 1];
  }
  
  private int spareBonus(int frameIndex) {
    return arrays[frameIndex + 2];
  }
  
  private int strikeBonus(int frameIndex) {
    return arrays[frameIndex + 1] + arrays[frameIndex + 2];
  }
  
  private boolean isSpare(int frameIndex) {
    return arrays[frameIndex] + arrays[frameIndex + 1] == 10;
  }
  
  private boolean isStrike(int frameIndex) {
    return arrays[frameIndex] == 10;
  }
}