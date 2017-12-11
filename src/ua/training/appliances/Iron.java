package ua.training.appliances;

public class Iron extends ElectricalAppliance {

    private int maxWorkingTemperature;
    private int curTemperature;

    public Iron(String name, int power, int price, int maxTemp) {
        super(name, power, price);
        maxWorkingTemperature = maxTemp;
    }

    public void plugIn() {
        super.plugIn();
        curTemperature = maxWorkingTemperature / 3;
    }
}