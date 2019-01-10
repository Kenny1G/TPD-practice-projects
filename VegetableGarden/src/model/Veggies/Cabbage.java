package model;

public class Cabbage extends Vegetable {

    public Cabbage() {
        super("Kate's Cabbage", VegType.LEAF);
        super.setInstructions("Start cabbage seeds indoors 6 to 8 weeks before the last spring frost.");
    }

    @Override
    public void feed() {
        System.out.println("Fertilize 3 weeks after transplanting.");
    }

    @Override
    public void water() {
        System.out.println("Keep soil moist with mulch and water 2 inches per week.");
    }

    @Override
    public void harvest() {
        System.out.println("Harvest when heads reach desired size and are firm. This will take around 70 days for most green cabbage varieties. Most early varieties will produce 1- to 3-pound heads.");
    }
}
