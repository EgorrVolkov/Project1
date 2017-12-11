package ua.training;

import ua.training.appliances.ElectricalAppliance;

import java.io.PrintWriter;
import java.util.List;

class View {

    void printMessage(String message, PrintWriter out) {
        out.print(message);
    }

    void printLnMessage(String message, PrintWriter out) {
        out.print(message+"<br>");
    }

    void printAppliance(ElectricalAppliance appliance, PrintWriter out) {
        printLnMessage("ElectricalAppliance{" +
                "name='" + appliance.getName() + '\'' +
                ", power=" + appliance.getCurrentPower() +
                ", price=" + appliance.getPrice() +
                ", pluggedIn=" + appliance.isPluggedIn() +
                '}', out);
    }

    void printAppliancesList(List<ElectricalAppliance> applianceList, PrintWriter out) {
        for (ElectricalAppliance curAppliance : applianceList) {
            printAppliance(curAppliance, out);
        }
    }
}
