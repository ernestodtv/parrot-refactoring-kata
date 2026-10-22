package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final double voltage;
    private final boolean isNailed;

    protected Parrot(ParrotTypeEnum type, double voltage, boolean isNailed) {
        this.type = type;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        if (type == ParrotTypeEnum.EUROPEAN) {
            return new EuropeanParrot();
        }
        if (type == ParrotTypeEnum.AFRICAN) {
            return new AfricanParrot(numberOfCoconuts);
        }
        return new Parrot(type, voltage, isNailed);
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> throw new IllegalStateException("European parrots are handled by EuropeanParrot");
            case AFRICAN -> throw new IllegalStateException("African parrots are handled by AfricanParrot");
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
        };
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> throw new IllegalStateException("European parrots are handled by EuropeanParrot");
            case AFRICAN -> throw new IllegalStateException("African parrots are handled by AfricanParrot");
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
        };
    }
}
