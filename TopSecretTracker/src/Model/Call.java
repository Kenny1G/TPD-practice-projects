package Model;

public class Call implements Traceable {
    private Cellphone cell;

    public Call(Cellphone cell){
        this.cell = cell;
        this.cell.addCall(this);
    }
    @Override
    public String getLocation() {
        return this.cell.getLocation();
    }

    @Override
    public Object getTrace() {
        return this.cell;
    }

    @Override
    public void track() {
        System.out.println("Tracking... " + this.cell.owner.name);

    }
}
