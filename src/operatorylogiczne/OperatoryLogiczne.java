package operatorylogiczne;

public class OperatoryLogiczne {

    public static void main(String[] args) {

        int x = 20;
        int y = 13;
        int z = 40;

        System.out.println("czy x jest większe od y lub y jest większe od z: "
                + (x > y || y > z));
        System.out.println("czy x jest większe od y oraz od z: "
                + (x > y && x > z));
        System.out.println("czy suma x i z jest większa lub równa y: "
                + ((x + y) >= y));
        System.out.println("czy różnica y i z jest mniejsza od x: "
                + ((y - z) < x));
        System.out.println("czy iloczyn x i y jest różny od z: "
                + (x * y != z));
        System.out.println("czy iloczyn x i y jest większy niż odwrotność ilorazu z i x: "
                + ((x * y > 1 / (z / x))));

    }
}
