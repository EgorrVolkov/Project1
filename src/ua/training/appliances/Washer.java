package ua.training.appliances;

public class Washer extends ElectricalAppliance {

    public abstract class Mode {

        private int rpm;
        private int temperature;

        Mode(int rpm, int temperature) {
            this.rpm = rpm;
            this.temperature = temperature;
        }

        public int getRpm() {
            return rpm;
        }

        public int getTemperature() {
            return temperature;
        }
    }

    public class EcoMode extends Mode {

        EcoMode() {
            super(0, 40);
        }
    }

    public class DefaultMode extends Mode {

        DefaultMode() {
            super(500, 60);
        }
    }

    public class IntensiveMode extends Mode {

        IntensiveMode() {
            super(900, 70);
        }
    }

    public class TurnedOffMode extends Mode {

        TurnedOffMode() {
            super(0, 0);
        }
    }

    private Mode mode;

    public Washer(String name, int power, int price) {
        super(name, power, price);
        setMode(new TurnedOffMode());
    }

    public void plugIn() {
        super.plugIn();
        setMode(new DefaultMode());
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
}

