package com.loonly.kata.bowling_game.day0905;

/**
 * @Author: Loonly
 * @Date: 2019/9/5 23:20
 */

public class Game1 {
  
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
        score += 10 + rollStrike(frameIndex);
        frameIndex ++;
      } else if (isSpare(frameIndex)) {
        score += 10 + rollSpare(frameIndex);
        frameIndex += 2;
      } else {
        score += sm(frameIndex);
        frameIndex += 2;
      }
    }
    return score;
  }
  
  private int sm(int frameIndex) {
    return arrays[frameIndex] + arrays[frameIndex + 1];
  }
  
  private int rollSpare(int frameIndex) {
    return arrays[frameIndex + 2];
  }
  
  private boolean isSpare(int frameIndex) {
    return arrays[frameIndex] + arrays[frameIndex + 1] == 10 ;
  }
  
  private int rollStrike(int frameIndex) {
    return arrays[frameIndex + 1] + arrays[frameIndex + 2];
  }
  
  private boolean isStrike(int frameIndex) {
    return arrays[frameIndex] == 10;
  }
}
