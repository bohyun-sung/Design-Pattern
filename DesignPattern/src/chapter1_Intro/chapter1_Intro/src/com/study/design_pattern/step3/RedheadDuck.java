package com.study.design_pattern.step3;

import com.study.design_pattern.step3.duckBehavior.FlyWithWings;
import com.study.design_pattern.step3.duckBehavior.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("빨간머리 오리입니다");
    }
}
