package br.com.dp.adapter;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class MallardDuckTest {

    @Test
    @Order(1)
    void quack() {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
    }

    @Test
    @Order(2)
    void fly() {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
    }
}