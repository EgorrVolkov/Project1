package ua.training;

import ua.training.appliances.ElectricalAppliance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Model {

    private List<ElectricalAppliance> appliancesList = new ArrayList<>();

    void addAppliance(ElectricalAppliance appliance) {
        appliancesList.add(appliance);
    }

    public int calculateTotalPowerConsumption() {
        int totalPowerConsumption = 0;
        for (ElectricalAppliance curAppliance : appliancesList) {
            totalPowerConsumption += curAppliance.getCurrentPower();
        }
        return totalPowerConsumption;
    }

    public List<ElectricalAppliance> sortByPowerConsumption() {
        Collections.sort(appliancesList);
        return appliancesList;
    }

    public ElectricalAppliance findApplianceByName(String string) {
        for (ElectricalAppliance curAppliance: appliancesList) {
            if (curAppliance.getName().contains(string))
                return curAppliance;
        }
        throw new NoSuchElementException("No such appliances found."); // TODO own exception, print to view
    }
}