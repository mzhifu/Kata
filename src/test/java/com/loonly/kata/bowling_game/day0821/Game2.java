package com.loonly.kata.bowling_game.day0821;

/**
 * @Author: Loonly
 * @Date: 2019/8/21 23:10
 */

public class Game2 {
  
  private int[] arrays = new int[21];
  
  private int currentRoll = 0;
  
  public void roll(int pins) {
    arrays[currentRoll++] = pins;
  }
  
  public int score() {
    int score = 0;
    int frameIndex= 0;
    for (int frame = 0; frame < 10; frame++) {
      if (isStrike(frameIndex)) {
        score += 10 + strikeBonus(frameIndex);
        frameIndex ++;
      } else if (isSpare(frameIndex)) {
        score += 10 + spareBonus(frameIndex);
        frameIndex += 2;
      } else {
        score += sum(arrays[frameIndex], frameIndex);
        frameIndex += 2;
      }
    }
    return score;
  }
  
  private int spareBonus(int frameIndex) {
    return arrays[frameIndex + 2];
  }
  
  private int sum(int array, int frameIndex2) {
    return array + arrays[frameIndex2];
  }
  
  private boolean isSpare(int frameIndex) {
    return arrays[frameIndex + 1] + arrays[frameIndex + 2] == 10 ;
  }
  
  private int strikeBonus(int frameIndex) {
    return arrays[frameIndex + 1] + arrays[frameIndex + 2];
  }
  
  private boolean isStrike(int frameIndex) {
    return arrays[frameIndex] == 10;
  }
}
