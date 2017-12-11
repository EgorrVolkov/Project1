package ua.training;

import ua.training.appliances.ElectricalAppliance;
import ua.training.appliances.Iron;
import ua.training.appliances.VacuumCleaner;
import ua.training.appliances.Washer;

import java.awt.Color;


public class UtilityController {

    public void createAppliances(Model model) {
        ElectricalAppliance washerSamsung = new Washer("Samsung SFBN5500M", 2200, 5500);
        washerSamsung.plugIn();
        model.addAppliance(washerSamsung);

        ElectricalAppliance washerIndesit = new Washer("Indesit IN1385", 1800, 4700);
        model.addAppliance(washerIndesit);

        ElectricalAppliance iron = new Iron("Tefal TF1300", 2600, 3000, 160);
        iron.plugIn();
        model.addAppliance(iron);

        ElectricalAppliance vacuumCleaner = new VacuumCleaner("Philips", 2000, 4000, Color.RED);
        model.addAppliance(vacuumCleaner);
    }
}
