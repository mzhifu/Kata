package com.loonly.kata.bowling_game.day0905;

/**
 * @Author: Loonly
 * @Date: 2019/9/5 23:34
 */

public class Game3 {
  
  private int[] arrays = new int[21];
  
  private int  currentRoll = 0;
  
  public void roll(int pins) {
    arrays[currentRoll ++ ] = pins;
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
        score += arrays[frameIndex] + arrays[frameIndex + 1];
        frameIndex += 2;
      }
    }
    return score;
  }
  
  private int spareBonus(int frameIndex) {
    return arrays[frameIndex + 2];
  }
  
  private boolean isSpare(int frameIndex) {
    return arrays[frameIndex + 1] + arrays[frameIndex] == 10;
  }
  
  private int strikeBonus(int frameIndex) {
    return arrays[frameIndex + 1] + arrays[frameIndex + 2];
  }
  
  private boolean isStrike(int frameIndex) {
    return arrays[frameIndex] == 10;
  }
}
