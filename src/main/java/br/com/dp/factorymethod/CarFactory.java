package br.com.dp.factorymethod;

public class CarFactory extends MotorcycleFactory {

	@Override
	protected MotorVehicle createMotorVehicle() {
		return new Car();
	}
}
