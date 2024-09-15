package br.com.dp.factorymethod;

public class Run {

    public static void main(String[] args) {

        MotorVehicleFactory motorFactory = new MotorcycleFactory();
        MotorVehicle motorcycle = motorFactory.create();
        motorcycle.build();

        MotorVehicleFactory carFactory = new CarFactory();
        MotorVehicle car = carFactory.create();
        car.build();
    }
}
