package com.company;

public class Main {

    public static void main(String[] args) {
        ScoreCalc scoreCalc = new ScoreCalc();
        System.out.print(scoreCalc.calc(15d,5d).getState());
    }
}
