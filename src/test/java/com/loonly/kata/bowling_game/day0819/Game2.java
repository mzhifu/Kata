package com.loonly.kata.bowling_game.day0819;

/**
 * @Author: Loonly
 * @Date: 2019/8/19 21:25
 */

public class Game2 {
  
  private int[] arrays = new int[21];
  
  private int currentRoll = 0;
  
  public void roll(int pins) {
    arrays[currentRoll++] = pins;
  }
  
  public int score() {
    int score = 0;
    int frameIndex = 0;
    for (int frame = 0; frame < 10; frame++) {
      if (arrays[frameIndex] == 10) {
        score += 10 + arrays[frameIndex + 1] + arrays[frameIndex + 2];
        frameIndex ++;
      } else if (arrays[frameIndex] + arrays[frameIndex + 1] == 10) {
        score += 10 + arrays[frameIndex + 2];
        frameIndex += 2;
      } else {
        score += arrays[frameIndex] + arrays[frameIndex + 1];
        frameIndex += 2;
      }
    }
    return score;
  }
}
