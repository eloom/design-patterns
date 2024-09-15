package br.com.dp.adapter;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Mallard Quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Flying");
    }
}
