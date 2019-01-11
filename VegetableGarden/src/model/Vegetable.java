package model;

public abstract class Vegetable implements Growable{

    public String name;
    public String instructions;
    public VegType type;

    public Vegetable(String name, VegType type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getInstructions() {
        return this.instructions;
    }

    protected void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public VegType getType() {
        return this.type;
    }

}
