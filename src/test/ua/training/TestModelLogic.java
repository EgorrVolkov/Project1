package test.ua.training;

import org.junit.Before;
import org.junit.Test;
import ua.training.ElectricalAppliance;
import ua.training.Model;
import ua.training.UtilityController;

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
        assertEquals(8600, model.calculateTotalPowerConsumption());
    }

    @Test
    public void testSortByPowerConsumption() {
        model.sortByPowerConsumption();
        int[] powerList = {1800, 2000, 2200, 2600};
        for (int i = 0; i < 4; i++) {
            assertEquals(powerList[i], model.getAppliancesList().get(i).getPower());
        }
    }

    @Test
    public void testFindApplianceByName() {
        String expected = "ElectricalAppliance{name='Philips', power=2000, price=4000, pluggedIn=false}";
        assertEquals(expected, model.findApplianceByName("Philips"));
    }
}