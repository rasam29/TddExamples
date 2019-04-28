package com.company;

import com.company.states.BaseState;
import com.company.states.BetwenNineAndTenState;
import com.company.states.FinalFailedState;
import com.company.states.ScoreState;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreCalcTest {

    ScoreCalc scoreCalc;
    @Before
    public void setUp(){
        scoreCalc = new ScoreCalc();
    }

    @org.junit.Test
    public void calc_finalFail() {
        BaseState b = scoreCalc.calc(5d,2d);
        assertTrue(b instanceof FinalFailedState);
        assertEquals("You Have been Final Failed!", b.getState());
    }
    @org.junit.Test
    public void calc_betweenNineAndTen() {
        BaseState baseState = scoreCalc.calc(2d,7d);
        assertTrue(baseState instanceof BetwenNineAndTenState);
        assertEquals("You have Passed With Some erfaghh!!!", baseState.getState());

    }

    @Test
    public void calc_score(){
        BaseState baseState = scoreCalc.calc(5d,12d);
        assertTrue(baseState instanceof ScoreState);
        assertEquals("Your Score Is 17.0", baseState.getState());
    }
}