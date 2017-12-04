package ua.training;

public class Iron extends ElectricalAppliance {

    int maxWorkingTemperature;
    int curTemperature;

    Iron(String name, int power, int price, int maxTemp) {
        super(name, power, price);
        maxWorkingTemperature = maxTemp;
    }

    public void plugIn() {
        super.plugIn();
        curTemperature = maxWorkingTemperature / 3;
    }
}