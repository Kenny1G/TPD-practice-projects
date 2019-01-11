package model;

public class Animal {
    protected String name;
    protected int age;
    protected Zookeeper caretaker;
    protected double weight;

    public Animal(String nm, int age, Zookeeper zk, double wgt) {
        name = nm;
        this.age = age;
        caretaker = zk;
        weight = wgt;
    }

    // getters
    public String getName() { return name; }

    public int getAge() { return age; }

    public Zookeeper getCaretaker() { return caretaker; }

    public double getWeight() { return weight; }
}
