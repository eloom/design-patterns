package br.com.dp.abstractfactory;

import br.com.dp.factorymethod.MotorVehicle;

public class FutureVehicleCorporation extends Corporation {

	@Override
	public MotorVehicle createMotorVehicle() {
		return new FutureVehicleMotorcycle();
	}

	@Override
	public ElectricVehicle createElectricVehicle() {
		return new FutureVehicleElectricCar();
	}

}
