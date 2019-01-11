package model;


import java.util.ArrayList;
import java.util.List;

public class Zookeeper {

    private String name;
    private int age;
    private List<Animal> animalList;
    private Animal favourite;

    public Zookeeper(String nm, int age){
        this.name = nm;
        this.age = age;
        animalList = new ArrayList<>();
    }

    // TODO: follow the instructions on the webpage to implement this class

    public String getName(){
        return this.name;
    }

    public  int getAge(){
        return  this.age;
    }

    public List<Animal> getAnimalList() {
        return this.animalList;
    }

    public Animal getFavourite() {
        return this.favourite;
    }

    public void setFavourite(Animal favourite) {
        this.favourite = favourite;
    }

    public void  addToList(Animal a){
        if (!animalList.contains(a)) {
            animalList.add(a);
        }
    }

    public boolean removeFromList(Animal a){
        if(this.animalList.contains(a)){
            this.animalList.remove(a);
            return true;
        }
        return false;
    }
}