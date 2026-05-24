package Q4;

public class Bicycle {

    private Q4.Owner owner;

    public Bicycle() {
        owner = new Q4.Owner();
    }

    public Bicycle(Q4.Owner owner) {
        this.owner = owner;
    }

    public Q4.Owner getOwner() {
        return owner;
    }

    public void setOwner(Q4.Owner owner) {
        this.owner = owner;
    }
}