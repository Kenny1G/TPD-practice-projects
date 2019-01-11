package ui;

import model.*;
import model.Veggies.Beets;
import model.Veggies.BellPeppers;
import model.Veggies.Cabbage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Vegetable> garden = new ArrayList<>();

    public static void main(String[] args) {
        garden.add(new Cabbage());
        garden.add(new Beets());
        garden.add(new BellPeppers());

        for (Vegetable g : garden){
            g.feed();
            g.harvest();
            g.water();
        }
    }
}
