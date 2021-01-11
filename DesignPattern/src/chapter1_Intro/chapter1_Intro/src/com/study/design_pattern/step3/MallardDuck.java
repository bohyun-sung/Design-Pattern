package com.study.design_pattern.step3;

import com.study.design_pattern.step3.duckBehavior.FlyWithWings;
import com.study.design_pattern.step3.duckBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("저는 물오리입니다");
    }
}
