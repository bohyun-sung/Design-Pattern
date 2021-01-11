package com.study.design_pattern.step3.duckBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("muteQuack 음소거 꽥");
    }
}
