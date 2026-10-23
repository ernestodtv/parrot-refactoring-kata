package parrot;

public class EuropeanParrot extends Parrot {

    EuropeanParrot() {
        super(ParrotTypeEnum.EUROPEAN, 0, false);
    }

    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }

}
