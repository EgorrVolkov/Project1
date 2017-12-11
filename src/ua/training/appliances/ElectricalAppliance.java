package ua.training.appliances;

import java.util.Comparator;

public class ElectricalAppliance implements Comparator<ElectricalAppliance>, Comparable<ElectricalAppliance> {

    private String name;
    private int power;
    private int price;
    private boolean pluggedIn;

    ElectricalAppliance(String name, int power, int price) {
        this.name = name;
        this.power = power;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPower() {
        if (isPluggedIn())
            return power;
        else return 0; // TODO create constant?
    }

    public int getMaxPower() {
        return power;
    }

    public int getPrice() {
        return price;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public void plugIn() {
        this.pluggedIn = true;
    }

    public int compareTo(ElectricalAppliance e) {
        return (this.name).compareTo(e.name);
    }

    public int compare(ElectricalAppliance lhs, ElectricalAppliance rhs) {
        return lhs.power - rhs.power;
    }
}
