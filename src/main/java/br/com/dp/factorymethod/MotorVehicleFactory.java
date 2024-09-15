package br.com.dp.factorymethod;

public abstract class MotorVehicleFactory {

	public MotorVehicle create() {
		MotorVehicle vehicle = createMotorVehicle();
		vehicle.build();

		return vehicle;
	}

	protected abstract MotorVehicle createMotorVehicle();
}
