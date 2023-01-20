package operatorylogiczne.ogrod;

public class ogrodnik {

    public static void main(String[] args) {

        Garden garden = new Garden();
        garden.plantAll();

        garden.monthlyTotalWaterConsumtion();
        garden.annualTotalWaterConsumtion();

    }

}
