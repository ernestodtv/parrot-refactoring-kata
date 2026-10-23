package parrot;

public abstract class Parrot {

    protected static final double BASE_SPEED = 12.0;

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

    public abstract String getCry();
}
