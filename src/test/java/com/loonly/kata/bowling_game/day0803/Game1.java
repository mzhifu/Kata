package com.loonly.kata.bowling_game.day0803;

/**
 * @Author: Loonly
 * @Date: 2019/8/4 22:39
 */

public class Game1 {
  
  private int[] array = new int[21];
  
  private int currentRoll = 0;
  
  public void roll(int pins) {
    array[currentRoll++] = pins;
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
    return array[frameIndex] + array[frameIndex + 1];
  }
  
  private int spareBonus(int frameIndex) {
    return array[frameIndex + 2];
  }
  
  private int strikeBonus(int frameIndex) {
    return array[frameIndex + 1] + array[frameIndex + 2];
  }
  
  private boolean isStrike(int frameIndex) {
    return array[frameIndex] == 10;
  }
  
  private boolean isSpare(int frameIndex) {
    return array[frameIndex] + array[frameIndex + 1] == 10;
  }
}
