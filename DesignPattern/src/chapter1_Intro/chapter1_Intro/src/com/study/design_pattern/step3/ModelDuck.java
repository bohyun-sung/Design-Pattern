package com.study.design_pattern.step3;

import com.study.design_pattern.step3.duckBehavior.FlyNoWay;
import com.study.design_pattern.step3.duckBehavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("모형오리");
    }
}
