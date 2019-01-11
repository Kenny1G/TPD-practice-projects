package Tests;

import model.Veggies.Beets;
import model.VegType;
import model.Vegetable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VeggieTest {

    private Vegetable veggie;

    @Before
    public void SetUp(){
        veggie = new Beets();
    }

    @Test
    public void testConstructor(){
        assertEquals(veggie.getName(), "Dwights Beets");
        assertEquals(veggie.getType(), VegType.ROOT);
        assertEquals(veggie.getInstructions(), "Till in aged manure before planting. Beets require especially good nutrition and a high phosphorus level to germinate. Go easy on nitrogen however, an excess will cause sprawling greens and tiny bulbs beneath the soil.");
    }
}
