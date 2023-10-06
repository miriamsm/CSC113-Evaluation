package Week5;
public abstract class Reptiles extends Animal{
    private int amountOfPlants;
    public Reptiles (String n , double w, int a){
        super(n,w);
        amountOfPlants=a;

    }

    @Override
    public String toString() {
        return super.toString()+"{" +
            " amountOfPlants='" + getAmountOfPlants() + "'" +
            "}";
    }

    public int getAmountOfPlants() {
        return this.amountOfPlants;
    }

    public void setAmountOfPlants(int amountOfPlants) {
        this.amountOfPlants = amountOfPlants;
    }
}