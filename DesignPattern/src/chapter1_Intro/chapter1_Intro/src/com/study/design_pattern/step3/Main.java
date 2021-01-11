package com.study.design_pattern.step3;

import com.study.design_pattern.step3.duckBehavior.FlyRocketPowered;

public class Main {
    // 날기 기능 추가 + 고무오리 추가
    public static void main(String [] args){

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();
        mallard.swim();

        Duck RedHead = new RedheadDuck();
        RedHead.performQuack();
        RedHead.performFly();
        RedHead.display();
        RedHead.swim();

        Duck Rubber = new RubberDuck();
        Rubber.performQuack();
        Rubber.performFly();
        Rubber.display();
        Rubber.swim();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
