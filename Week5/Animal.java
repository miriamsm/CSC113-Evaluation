package Week5;
public abstract class Animal{
    private String name;
    protected double weight;
    public Animal (String n, double w){
        name=n;
        weight=w;
    }
    public abstract void sleep ();

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", weight='" + getWeight() + "'" +
            "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
