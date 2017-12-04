package ua.training;

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

    public int getPower() {
        return power;
    }

    public int getPrice() {
        return price;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    void plugIn() {
        this.pluggedIn = true;
    }

    public int compareTo(ElectricalAppliance e) {
        return (this.name).compareTo(e.name);
    }

    public int compare(ElectricalAppliance e, ElectricalAppliance e1) {
        return e.power - e1.power;
    }

    @Override
    public String toString() {
        return "ElectricalAppliance{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", price=" + price +
                ", pluggedIn=" + pluggedIn +
                '}';
    }
}
