package com.study.design_pattern.step1;

public class RedheadDuck extends Duck{
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
        System.out.println("나는 빨간머리 오리입니다.");
    }
}
