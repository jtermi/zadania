package tydzien4.notebook;

public class Notebook {

    String producer;
    String model;
    int ram;
    int frequency;
    String operationSystem;

    public Notebook() {
    }

    public Notebook(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Notebook(String producer, String model, int ram, int frequency, String operationSystem) {

        System.out.println("Tworze komputer ze wszystkimi parametrami");
        System.out.printf("Producent komputera: %s\n\n", producer);
        this.producer = producer;
        this.model = model;
        this.ram = ram;
        this.frequency = frequency;
        this.operationSystem = operationSystem;
    }

    public Notebook(String producer, String model, int frequency, String operationSystem) {
        System.out.println("Tworze komputer bez RAM");
        System.out.printf("Producent komputera: %s\n\n", producer);
        this.producer = producer;
        this.model = model;
        this.frequency = frequency;
        this.operationSystem = operationSystem;
    }

    public Notebook(String producer, String model, int ram, int frequency) {
        System.out.println("Tworze komputer bez systemu operacyjnego");
        System.out.printf("Producent komputera: %s\n\n", producer);
        this.producer = producer;
        this.model = model;
        this.ram = ram;
        this.frequency = frequency;
    }
}
