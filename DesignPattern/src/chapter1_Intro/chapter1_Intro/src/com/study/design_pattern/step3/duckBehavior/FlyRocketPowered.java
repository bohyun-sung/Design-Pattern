package com.study.design_pattern.step3.duckBehavior;

public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("로케트 쁑~");
    }
}
