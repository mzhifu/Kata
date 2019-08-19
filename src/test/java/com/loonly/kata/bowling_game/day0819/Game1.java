package com.loonly.kata.bowling_game.day0819;

/**
 * @Author: Loonly
 * @Date: 2019/8/19 21:09
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
    for (int frame = 0; frame < 10; frame++) {
      if (isStrike(frameIndex)) {
        score += 10 + strikeBonus(frameIndex);
        frameIndex ++;
      } else if (isSpare(frameIndex)) {
        score += 10 + spareBonus(frameIndex);
        frameIndex += 2;
      } else {
        score += sum(frameIndex);
        frameIndex += 2;
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
  
  private boolean isSpare(int frameIndex) {
    return arrays[frameIndex] + arrays[frameIndex + 1] == 10;
  }
  
  private int strikeBonus(int frameIndex) {
    return arrays[frameIndex + 1] + arrays[frameIndex + 2];
  }
  
  private boolean isStrike(int frameIndex) {
    return arrays[frameIndex] == 10;
  }
}
