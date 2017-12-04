package ua.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model {

    private List<ElectricalAppliance> appliancesList = new ArrayList<>();

    public List<ElectricalAppliance> getAppliancesList() {
        return appliancesList;
    }

    void addToList(ElectricalAppliance appliance) {
        appliancesList.add(appliance);
    }

    public int calculateTotalPowerConsumption() {
        int totalPowerConsumption = 0;
        for (ElectricalAppliance curAppliance : appliancesList) {
            totalPowerConsumption += curAppliance.getPower();
        }
        return totalPowerConsumption;
    }

    public void sortByPowerConsumption() {
        Collections.sort(appliancesList);
    }

    public String findApplianceByName(String string) {
        for (ElectricalAppliance curAppliance: appliancesList) {
            if (curAppliance.getName().contains(string))
                return curAppliance.toString();
        }
        return "No such appliances found.";
    }
}