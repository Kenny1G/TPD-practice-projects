package model.Veggies;

import model.VegType;
import model.Vegetable;

public class Beets extends Vegetable {

    public Beets(){
        super("Dwights Beets", VegType.ROOT);
        super.setInstructions("Till in aged manure before planting. Beets require especially good nutrition and a high phosphorus level to germinate. Go easy on nitrogen however, an excess will cause sprawling greens and tiny bulbs beneath the soil.");
    }

    @Override
    public void feed() {
        System.out.println("Till in aged manure before planting. Beets require especially good nutrition and a high phosphorus level to germinate.");
    }

    @Override
    public void water() {
        System.out.println("Mulch and water well. Beets need to maintain plenty of moisture.");
    }

    @Override
    public void harvest() {
        System.out.println("Days to maturity tend to be between 50 and 70 for most varieties, although they can be harvested at any time you see fit. If you like larger bulbs, wait longer, but understand they will be tougher and woody.");
    }
}
