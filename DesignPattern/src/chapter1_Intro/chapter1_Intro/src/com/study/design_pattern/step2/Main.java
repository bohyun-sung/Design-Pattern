package com.study.design_pattern.step2;

public class Main {
    // 날기 기능 추가 + 고무오리 추가
    public static void main(String [] args){
        Duck duck1 = new Duck();
        duck1 = new MallardDuck();
        duck1.quack();
        duck1.swim();
        duck1.fly();
        duck1.display();

        Duck duck2 = new Duck();
        duck2 = new RedheadDuck();
        duck2.quack();
        duck2.swim();
        duck2.fly();
        duck2.display();

        Duck duck3 = new Duck();
        duck3 = new RubberDuck();
        duck3.quack();
        duck3.swim();
        duck3.fly();
        duck3.display();
    }
}
