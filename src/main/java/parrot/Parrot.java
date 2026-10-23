package parrot;

public abstract class Parrot {

    private final ParrotTypeEnum type;
    private final double voltage;
    private final boolean isNailed;

    protected Parrot(ParrotTypeEnum type, double voltage, boolean isNailed) {
        this.type = type;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot();
            case AFRICAN -> new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(voltage, isNailed);
        };
    }

    public abstract double getSpeed();

    protected double getBaseSpeed() {
        return 12.0;
    }

    public abstract String getCry();
}
