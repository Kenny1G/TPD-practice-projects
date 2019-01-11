package Tests;

import model.Animal;
import model.Horse;
import model.Zookeeper;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ZookeeperTests {

    private Zookeeper z;
    private List<Animal> theList = new ArrayList<>();
    private Animal favorite1 = new Horse("benji","Nigeria", 4, z, 20.5, 50.0);
    private Animal favorite2 = new Horse("benjis","Nigeria", 7 ,z, 25.5, 30.0);

    @Before
    public void setup(){
        z = new Zookeeper("kenny G", 23);
    }

    @Test
    public void constructorTest(){
        assertEquals(z.getName(), "kenny G");
        assertEquals(z.getAge(), 23);
        assertEquals(z.getAnimalList(), theList);
    }

    @Test
    public void favoriteTest(){
        z.setFavourite(favorite1);
        assertEquals(z.getFavourite(),favorite1);
        z.setFavourite(favorite2);
        assertEquals(z.getFavourite(),favorite2);
    }

    @Test
    public void listTests(){
        z.addToList(favorite1);
        assertFalse(z.removeFromList(favorite2));
        z.addToList(favorite2);
        assertTrue(z.removeFromList(favorite2));

    }

}
