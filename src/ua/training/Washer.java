package ua.training;

public class Washer extends ElectricalAppliance {

    enum Mode {INTENSIVE, ECO, DEFAULT}

    int maxRPM;
    int maxTemperature;

    Washer(String name, int power, int price) {
        super(name, power, price);
    }

    public void plugIn() {
        super.plugIn();
        setMode(Mode.DEFAULT);
    }

    void setMode(Mode mode) {
        switch (mode) {
            case ECO:
                maxTemperature = 40;
                maxRPM = 0;
                break;
            case DEFAULT:
                maxTemperature = 60;
                maxRPM = 500;
                break;
            case INTENSIVE:
                maxTemperature = 70;
                maxRPM = 900;
        }
    }
}