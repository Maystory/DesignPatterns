package com.swun.dp.adapter;

public class DuckTestDrive {
    public static void main(String args[]){
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
