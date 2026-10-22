package parrot;

public class AfricanParrot extends Parrot {

    private final int numberOfCoconuts;

    AfricanParrot(int numberOfCoconuts) {
        super(ParrotTypeEnum.AFRICAN, 0, false);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    private double getLoadFactor() {
        return 9.0;
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }

}
