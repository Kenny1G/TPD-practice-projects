package Model;

public class Fingerprint implements Traceable {
    private Person owner;
    private String precinct;

    public Fingerprint(String precinct, Person owner){
        this.precinct = precinct;
        this.owner = owner;
        this.owner.setFingerprint(this);
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String getLocation() {
        return this.precinct;
    }

    @Override
    public Object getTrace() {
        return this.owner;
    }

    @Override
    public void track() {
        System.out.println("Fingerprint collected at"+ this.getLocation());

    }
}
