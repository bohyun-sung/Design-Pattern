package com.study.design_pattern.step3.duckBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack 꽦");
    }
}
