package ua.training;

import java.awt.*;

class VacuumCleaner extends ElectricalAppliance {

    Color color;

    VacuumCleaner(String name, int power, int price, Color color) {
        super(name, power, price);
        this.color = color;
    }
}