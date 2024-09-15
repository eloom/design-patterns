package br.com.dp.factorymethod;

public class MotorcycleFactory extends MotorVehicleFactory {

	@Override
	protected MotorVehicle createMotorVehicle() {
		return new Motorcycle();
	}

}
