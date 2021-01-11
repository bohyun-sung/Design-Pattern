package com.study.design_pattern.step2;

public class RubberDuck extends Duck{
    @Override
    public void quack() {
        super.quack();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void display() {
        System.out.println("고무오리!");
    }

    @Override
    public void fly() {
        super.fly();
    }
}
