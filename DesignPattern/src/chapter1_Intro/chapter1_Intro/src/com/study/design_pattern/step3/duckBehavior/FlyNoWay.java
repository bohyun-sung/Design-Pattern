package com.study.design_pattern.step3.duckBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날지 못함 추락쓰");
    }
}
