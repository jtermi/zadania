package operatorylogiczne.skrzynia;

import org.w3c.dom.ls.LSOutput;

public class Trunk {
    int height;
    int width;
    int length;

    public Trunk(int height , int width , int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    void dimensions() {
        System.out.println("Oto wymiary skrzyni: \n");
        System.out.println("Wysokość: " + this.height);
        System.out.println("Szerokość: " + this.width);
        System.out.println("Długość: " + this.length);
    }

    void volume() {
        System.out.println("\n Pojęmnność skrzyni wynosi: " + this.length * this.width * this.height);
    }

}
