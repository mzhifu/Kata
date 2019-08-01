package com.loonly.kata.bowling_game.day0801;

/**
 * @Author: Loonly
 * @Date: 2019/8/2 0:00
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
      if (isStrike(arrays[frameIndex])) {
        score += 10 + strikeBonus(frameIndex);
        frameIndex ++;
      } else if (isSpare(frameIndex)) {
        score += 10 + spareRoll(frameIndex);
        frameIndex += 2;
      } else {
        score += sumOfFrameIn(frameIndex);
        frameIndex += 2;
      }
      
    }
    return score;
  }
  
  private int sumOfFrameIn(int frameIndex) {
    return arrays[frameIndex] + arrays[frameIndex + 1];
  }
  
  private int spareRoll(int frameIndex) {
    return arrays[frameIndex + 2];
  }
  
  private boolean isSpare(int frameIndex) {
    return arrays[frameIndex] + arrays[frameIndex + 1] == 10;
  }
  
  private int strikeBonus(int frameIndex) {
    return arrays[frameIndex + 1] + arrays[frameIndex + 2];
  }
  
  private boolean isStrike(int frameIndex) {
    return frameIndex == 10;
  }
}
