package ua.training.appliances;

import java.awt.Color;

public class VacuumCleaner extends ElectricalAppliance {

    private Color color;

    public VacuumCleaner(String name, int power, int price, Color color) {
        super(name, power, price);
        this.color = color;
    }
}