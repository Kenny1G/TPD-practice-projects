package Model;

import java.util.List;

public class Cellphone implements Traceable {
    private String location;
    List<Call> calls;
    Person owner;

    public Cellphone(String location, Person owner){
        this.location = location;
        this.owner = owner;
    }

    public void addCall(Call c){
        this.calls.add(c);
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public Object getTrace() {
        return this;
    }

    @Override
    public void track() {
        System.out.println("Cellphone is at"+ this.location);

    }
}
