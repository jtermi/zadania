package operatorylogiczne.radio;

public class Radio {

    int volume;
    float frequency;
    char modulation;

    public Radio(int volume , float frequency , char modulation) {
        this.volume = volume;
        this.frequency = frequency;
        this.modulation = modulation;
    }

    public void printout() {
        System.out.println("Dane stacji radiowej");
        System.out.println("Częstotliwość: " + frequency);
        System.out.println("Modulacja: " + modulation);
        System.out.println("Głośność: " + volume + "\n");
    }

}
