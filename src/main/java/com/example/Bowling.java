package com.example;

public class Bowling {
    private int[] rolls = new int[20];
    private int currentRoll = 0;
    public int score(){
        int score = 0;
        for(int i = 0 ; i<20 ; i+=2){
            if(i<=18 && rolls[i+1]+rolls[i] == 10) score+= 10 +rolls[i+2];
            else score+=rolls[i]+rolls[i+1];
        }
        return score;
    }
    public void roll(int pins){
        rolls[currentRoll] = pins;
        currentRoll++;
    }
}
