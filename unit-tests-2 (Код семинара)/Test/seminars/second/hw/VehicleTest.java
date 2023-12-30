package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car = new Car("Hunday", "i40", 2021);
    Motorcycle moto = new Motorcycle("Kawasaki", "Vulkan", 2020);

    @Test
    void instanceOf() {
        assertThat(car instanceof Vehicle);
    }

    @Test
    void quantityOfCarsWheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void quantityOfMotorcycleWheels() {
        assertEquals(2, moto.getNumWheels());
    }

    @Test
    void speedOfCar() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void speedOfMotorcycle() {
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    @Test
    void parkCar() {
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void parkMotorcycle() {
        moto.park();
        assertEquals(0, moto.getSpeed());
    }



}