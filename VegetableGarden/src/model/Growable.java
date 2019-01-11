package model;

public interface Growable {
    //EFFECTS: prints out how this growable will be fed
    void feed();

    //EFFECTS: prints out how this growable should be watered
    void water();

    //EFFECTS: returns the instructions for this growable
    String getInstructions();

    //EFFECTS: prints out how this growable should be harvested
    void harvest();


}
