package br.com.dp.abstractfactory;

import br.com.dp.factorymethod.MotorVehicle;

public class Run {

	public static void main(String[] args) {
		Corporation futureVehicleCorporation = new FutureVehicleCorporation();
		MotorVehicle motorVehicle = futureVehicleCorporation.createMotorVehicle();
		ElectricVehicle electricVehicle = futureVehicleCorporation.createElectricVehicle();
		motorVehicle.build();
		electricVehicle.build();

		// NextGen
		Corporation motoCorporation = new NextGenCorporation();
		motorVehicle = motoCorporation.createMotorVehicle();
		electricVehicle = motoCorporation.createElectricVehicle();
		motorVehicle.build();
		electricVehicle.build();
	}

}
