package com.study.design_pattern.step3.duckBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squack 스꿱");
    }
}
