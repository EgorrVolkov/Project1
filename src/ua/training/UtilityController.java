package ua.training;

import java.awt.*;


public class UtilityController {

    public void createAppliances(Model model) {
        ElectricalAppliance washerSamsung = new Washer("Samsung SFBN5500M", 2200, 5500);
        washerSamsung.plugIn();
        model.addToList(washerSamsung);

        ElectricalAppliance washerIndesit = new Washer("Indesit IN1385", 1800, 4700);
        model.addToList(washerIndesit);

        ElectricalAppliance iron = new Iron("Tefal TF1300", 2600, 3000, 160);
        iron.plugIn();
        model.addToList(iron);

        ElectricalAppliance vacuumCleaner = new VacuumCleaner("Philips", 2000, 4000, Color.RED);
        model.addToList(vacuumCleaner);
    }
}
