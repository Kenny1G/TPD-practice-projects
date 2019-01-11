package Model;

public class Person implements Traceable {
    String name;
    String location;
    Fingerprint fingerprint;
    int age;

    public Person(String name,int age, String location){
        this.name = name;
        this.location = location;
        this.age = age;
        fingerprint = null;
    }


    public Fingerprint getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(Fingerprint fingerprint) {
        this.fingerprint = fingerprint;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public Object getTrace() {
        return null;
    }

    @Override
    public void track() {

    }
}
