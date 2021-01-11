package com.study.design_pattern.step3;

import com.study.design_pattern.step3.duckBehavior.FlyBehavior;
import com.study.design_pattern.step3.duckBehavior.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {

    }
    public void swim(){
        System.out.println("헤엄헤엄");
    }
    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
