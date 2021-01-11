package com.study.design_pattern.step1;

public class Main {
    public static void main(String [] args){
        Duck duck1 = new Duck();
        duck1 = new MallardDuck();
        duck1.quack();
        duck1.swim();
        duck1.display();

        Duck duck2 = new Duck();
        duck2 = new RedheadDuck();
        duck2.quack();
        duck2.swim();
        duck2.display();
    }
}
