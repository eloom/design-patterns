package br.com.dp.adapter;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class TurkeyAdapterTest {

    @Test
    @Order(1)
    void quack() {
        Duck mallardDuck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        mallardDuck.quack();
        turkeyAdapter.quack();
    }

    @Test
    @Order(2)
    void fly() {
        Duck mallardDuck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        mallardDuck.fly();
        turkeyAdapter.fly();
    }
}