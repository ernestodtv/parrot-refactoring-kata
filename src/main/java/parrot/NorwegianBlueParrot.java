package parrot;

public class NorwegianBlueParrot extends Parrot {

    private static final double MAX_SPEED = 24.0;

    private final double voltage;

    private final boolean isNailed;

    NorwegianBlueParrot(double voltage, boolean isNailed) {
        super(ParrotTypeEnum.NORWEGIAN_BLUE, voltage, isNailed);
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getSpeedWithVoltage();
    }

    private double getSpeedWithVoltage() {
        return Math.min(MAX_SPEED, voltage * BASE_SPEED);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }

}
