package br.com.dp.factorymethod;

public class Car implements MotorVehicle {

	@Override
	public void build() {
		System.out.println("Build Car");
	}
}
