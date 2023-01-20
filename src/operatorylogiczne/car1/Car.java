package operatorylogiczne.car1;

public class Car {
    String name;
    int power;
    int speed;

    public Car(String name , int power , int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    void turbo() {
        this.power *= 1.1;
    }

    void increaseSpeed(int speed) {
        this.speed += speed;
    }

    void decreaseSpeed(int speed) {
        this.speed -= speed;
    }

    void show() {
        System.out.println("Informacja o aktualnym samochodzie: ");
        System.out.println("Nazwa samochodu: " + this.name);
        System.out.println("Moc silnika: " + this.power);
        System.out.println("Aktualna prędkość: " + this.speed + "\n");
    }

}
