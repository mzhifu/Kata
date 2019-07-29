package com.loonly.kata.bowling_game.day0729;

/**
 * @Author: Loonly
 * @Date: 2019/7/30 0:13
 */

public class Game3 {
  
  private int[] rolls = new int[21];
  
  private int currentRoll = 0;
  
  public void roll(int pins) {
    rolls[currentRoll++] = pins;
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
        score += sumOfFrameIn(frameIndex);
        frameIndex += 2;
      }
    }
    return score;
  }
  
  private int spareBonus(int frameIndex) {
    return rolls[frameIndex +2];
  }
  
  private int strikeBonus(int frameIndex) {
    return rolls[frameIndex + 1] + rolls[frameIndex + 2];
  }
  
  private int sumOfFrameIn(int frameIndex) {
    return rolls[frameIndex] + rolls[frameIndex + 1];
  }
  
  private boolean isSpare(int frameIndex) {
    return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
  }
  
  private boolean isStrike(int frameIndex) {
    return rolls[frameIndex] == 10;
  }
}
