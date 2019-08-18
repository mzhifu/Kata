package com.loonly.kata.bowling_game.day0817;

/**
 * @Author: Loonly
 * @Date: 2019/8/18 22:53
 */

public class Game3 {
  
  private int[] arrays = new int[21];
  
  private int currentRoll = 0;
  
  public void roll(int pins) {
    arrays[currentRoll++] = pins;
  }
  
  public int score() {
    int score = 0;
    for (int i = 0; i < 10; i++) {
      if (arrays[i] + arrays[i + 1] == 10) {
        score += 10 + arrays[i + 2];
        i += 2;
      } else {
        score += arrays[i] + arrays[i + 2];
        i += 2;
      }
    }
    return 0;
  }
}
