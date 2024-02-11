package hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void createVehicle() {
        car = new Car("Ford Motor Company", "Ford Mustang Shelby 500", 1968);
        motorcycle = new Motorcycle("Honda", "Honda Steed 400 VLX", 1991);
    }


    /* 1. Проверить, что экземпляр объекта Car также является
    экземпляром транспортного средства (используя оператор instanceof).
     */

    @Test
    void checkCarInstanceOfVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }


    // 2. Проверить, что объект Car создается с 4-мя колесами.

    @Test
    void checkNumberOfWheelsForCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }


    // 3. Проверить, что объект Motorcycle создается с 2-мя колесами.

    @Test
    void checkNumberOfWheelsForMotorcycle() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }


    /* 4. Проверить, что объект Car развивает скорость 60
     в режиме тестового вождения (используя метод testDrive()).
     */

    @Test
    void checkTestDriveSpeedForCar() {
        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }


    /* 5. Проверить, что объект Motorcycle развивает скорость 75
    в режиме тестового вождения (используя метод testDrive()).
     */

    @Test
    void checkTestDriveSpeedForMotorcycle() {
        motorcycle.testDrive();

        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }


    /* 6. Проверить, что в режиме парковки (сначала testDrive, потом park,
    т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
     */

    @Test
    void checkParkSpeedAfterTestDriveForCar() {
        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }


    /* 7. Проверить, что в режиме парковки (сначала testDrive, потом park,
     т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
     */

    @Test
    void checkParkSpeedAfterTestDriveForMotorcycle() {
        motorcycle.testDrive();
        motorcycle.park();

        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
