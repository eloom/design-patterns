package br.com.dp.abstractfactory;

import br.com.dp.factorymethod.MotorVehicle;

public class NextGenMotorcycle implements MotorVehicle {

	@Override
	public void build() {
		System.out.println("NextGen Motorcycle");
	}

}
