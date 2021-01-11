package com.study.design_pattern.step3;

import com.study.design_pattern.step3.duckBehavior.FlyWithWings;
import com.study.design_pattern.step3.duckBehavior.Quack;

public class RubberDuck extends Duck {


    public RubberDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("고무 오리입니다");
    }
}
