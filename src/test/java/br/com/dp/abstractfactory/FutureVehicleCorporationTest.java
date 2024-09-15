package br.com.dp.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import br.com.dp.factorymethod.MotorVehicle;

class FutureVehicleCorporationTest {

	Corporation futureVehicleCorporation;

	@BeforeEach
	void setUp() {
		futureVehicleCorporation = new FutureVehicleCorporation();
	}

	@AfterEach
	void tearDown() {
		futureVehicleCorporation = null;
	}

	@Test
	@DisplayName("Testa se a instância de motorVehicle é FutureVehicleMotorcycle")
	@Order(1)
	void testFutureVehicleMotorcycleInstanceOf() {
		MotorVehicle motorVehicle = futureVehicleCorporation.createMotorVehicle();

		assertInstanceOf(FutureVehicleMotorcycle.class, motorVehicle);
	}

	@Test
	@DisplayName("Testa se a instância de electricVehicle é FutureVehicleElectricCar")
	@Order(2)
	void testFutureVehicleElectricCarInstanceOf() {
		ElectricVehicle electricVehicle = futureVehicleCorporation.createElectricVehicle();

		assertInstanceOf(FutureVehicleElectricCar.class, electricVehicle);
	}

}
