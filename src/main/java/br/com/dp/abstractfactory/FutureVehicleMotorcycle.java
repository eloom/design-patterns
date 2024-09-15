package br.com.dp.abstractfactory;

import br.com.dp.factorymethod.MotorVehicle;

public class FutureVehicleMotorcycle implements MotorVehicle {

	@Override
	public void build() {
		System.out.println("Future Vehicle Motorcycle");
	}
}
