package com.company.states;

public class ScoreState implements BaseState {
    Double finalScore;

    public ScoreState(Double finalScore) {
        this.finalScore = finalScore;
    }

    @Override
    public String getState() {
        return "Your Score Is "+finalScore;
    }
}
