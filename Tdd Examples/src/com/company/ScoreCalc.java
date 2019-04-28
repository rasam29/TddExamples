package com.company;

import com.company.states.BaseState;
import com.company.states.BetwenNineAndTenState;
import com.company.states.FinalFailedState;
import com.company.states.ScoreState;

public class ScoreCalc {

    public BaseState calc(Double projectScore,Double finalScore){
        if (finalScore<7){
            return new FinalFailedState();
        }else if ((projectScore+finalScore)>=9 &&(projectScore+finalScore)<=10){
            return new BetwenNineAndTenState();
        }else {
            return new ScoreState(projectScore+finalScore);
        }
    }
}
