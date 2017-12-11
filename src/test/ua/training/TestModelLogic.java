package test.ua.training;

import org.junit.Before;
import org.junit.Test;
import ua.training.Model;
import ua.training.UtilityController;
import ua.training.appliances.ElectricalAppliance;
import ua.training.appliances.VacuumCleaner;

import java.awt.Color;

import static org.junit.Assert.assertEquals;

public class TestModelLogic {

    private Model model;

    @Before
    public void initialization() {
        model = new Model();
        UtilityController utilityController = new UtilityController();
        utilityController.createAppliances(model);
    }

    @Test
    public void testCalculateTotalPowerConsumption() {
        assertEquals(4800, model.calculateTotalPowerConsumption()); // TODO remove magic constants
    }

    @Test
    public void testSortByPowerConsumption() {
        model.sortByPowerConsumption();
        int[] powerList = {1800, 2000, 2200, 2600}; // TODO remove magic constants
        for (int i = 0; i < 4; i++) {
            assertEquals(powerList[i], model.sortByPowerConsumption().get(i).getMaxPower());
            // TODO use current or max available power consumption?
        }
    }

    @Test
    public void testFindApplianceByName() { // TODO remove magic constants
        // TODO remove explicit ElectricalAppliance instantiation
        ElectricalAppliance expected = new VacuumCleaner("Philips", 2000, 4000, Color.RED);
        assertEquals(expected, model.findApplianceByName("Philips"));
    }
}