package operatorylogiczne.car1;

public class CarController {

    Car car;
    void turbo(Car car) {
                car.power *= 1.1;
    }

    void increaseSpeed(Car car, int speed) {
        car.speed += speed;
    }

    void decreaseSpeed(Car car, int speed)
    {
        car.speed -= speed;
    }

}
