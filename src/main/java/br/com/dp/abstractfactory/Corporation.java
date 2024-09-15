package br.com.dp.abstractfactory;

import br.com.dp.factorymethod.MotorVehicle;

public abstract class Corporation {

	public abstract MotorVehicle createMotorVehicle();

	public abstract ElectricVehicle createElectricVehicle();
}
