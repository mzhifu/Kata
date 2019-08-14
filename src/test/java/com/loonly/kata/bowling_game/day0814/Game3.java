package com.loonly.kata.bowling_game.day0814;

/**
 * @Author: Loonly
 * @Date: 2019/8/14 23:25
 */

public class Game3 {
  
  private int[] arrays = new int[21];
  
  private int currentRoll = 0;
  
  public void roll(int pins) {
    arrays[currentRoll++] = pins;
  }
  
  public int score() {
    int score = 0;
    int frameIndex = 0;
    for (int frame = 0; frame < 10; frame++) {
      if (isStrike(frameIndex)) {
        score += 10 + arrays[frameIndex + 1] + arrays[frameIndex + 2];
        frameIndex ++;
      } else if (isSpare(frameIndex)) {
        score += 10 + arrays[frameIndex + 2];
        frameIndex += 2;
      } else {
        score += arrays[frameIndex] + arrays[frameIndex + 1];
        frameIndex += 2;
      }
    }
    return score;
  }
  
  private boolean isStrike(int frameIndex) {
    return arrays[frameIndex] == 10;
  }
  
  private boolean isSpare(int frameIndex) {
    return arrays[frameIndex] + arrays[frameIndex + 1] == 10;
  }
}
