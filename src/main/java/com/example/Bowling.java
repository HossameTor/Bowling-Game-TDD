package com.example;

public class Bowling {
    private int[] rolls = new int[20];
    private int currentRoll = 0;

    public int score(){
        int score =0;
        int firstInFrame = 0;
        for (int frame = 0; frame < 10; frame++) {
            if(isStrike(firstInFrame)){
                score+= 10+rolls[firstInFrame+1]+rolls[firstInFrame+2];
                firstInFrame +=1;
            }
            else if (isSpare(firstInFrame)){
                score += 10 + rolls[firstInFrame+2];
                firstInFrame += 2;
            }else{
                score+= rolls[firstInFrame]+rolls[firstInFrame+1];
                firstInFrame += 2;
            }
        }
        return score;
    }

    public boolean isStrike(int firstInFrame){
        return rolls[firstInFrame]==10;
    }

    public boolean isSpare(int firstInFrame){
        return (rolls[firstInFrame]+rolls[firstInFrame+1]==10);
    }

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }
}
