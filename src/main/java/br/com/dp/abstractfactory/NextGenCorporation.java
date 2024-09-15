package br.com.dp.abstractfactory;

import br.com.dp.factorymethod.MotorVehicle;

public class NextGenCorporation extends Corporation {

	@Override
	public MotorVehicle createMotorVehicle() {
		return new NextGenMotorcycle();
	}

	@Override
	public ElectricVehicle createElectricVehicle() {
		return new NextGenElectricCar();
	}

}
