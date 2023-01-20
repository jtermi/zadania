package operatorylogiczne.car1;

public class test {
    public static void main(String[] args) {

        Car car = new Car ("Ford", 160, 0);
        CarController carController = new CarController();

        car.show();

        System.out.println("zwiekszamy predkosc o 100");
        carController.increaseSpeed(car, 100);
        car.show();

        System.out.println("zmniejszamy predkosc o 30");
        carController.decreaseSpeed(car,30);
        car.show();

        System.out.println("wlaczamy turbo");
        carController.turbo(car);
        car.show();

    }
}
