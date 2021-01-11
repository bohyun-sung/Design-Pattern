package com.study.design_pattern.step3.duckBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날개로 나는중");
    }
}
