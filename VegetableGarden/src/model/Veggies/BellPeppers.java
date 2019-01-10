package model;

public class BellPeppers extends Vegetable {

    public BellPeppers() {
        super("Kenny's Peppers", VegType.SEED);
        super.setInstructions("The temperature must be at least 70° F for seed germination, so keep them in a warm area for the best and fastest results.");
    }

    @Override
    public void feed() {
        System.out.println("Fertilize after the first fruit set.");
    }

    @Override
    public void water() {
        System.out.println("Water one to two inches per week, but remember that peppers are extremely heat sensitive. If you live in a warm or desert climate, watering everyday may be necessary.");
    }

    @Override
    public void harvest() {
        System.out.println("Harvest as soon as peppers reach desired size");
    }
}
