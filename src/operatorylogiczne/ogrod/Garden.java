package operatorylogiczne.ogrod;

public class Garden {

    Plant plant1 = new Plant("Kaktus", 2);
    Plant plant2 = new Plant("Brzoza", 320);
    Plant plant3 = new Plant("Sekwoja", 1640);

    public void plantDescriptionPrintout(Plant plant) {
        System.out.println("Nazwa rośliny: " + plant.name);
        System.out.println("Miesięczne zuzycie wody w litrach: " + plant.waterConsumption + "\n");
    }

    public void plantAll() {
        plantDescriptionPrintout(plant1);
        plantDescriptionPrintout(plant2);
        plantDescriptionPrintout(plant3);
    }

    public void monthlyTotalWaterConsumtion() {
        System.out.println("Wszystkie rośliny łącznie zużywają wody miesięcznie, l: "
                + (plant1.waterConsumption
                + plant2.waterConsumption
                + plant3.waterConsumption));
    }

    public void annualTotalWaterConsumtion() {
        System.out.println("Wszystkie rośliny łącznie zużywają wody rocznie, l: "
                + ((plant1.waterConsumption
                + plant2.waterConsumption
                + plant3.waterConsumption) * 12));
    }

}
