// write your information
// Name : Miriam almogren
// ID : 443200568
public abstract class Order {
    protected int ID;
    protected String date;
    protected double price;

    public Order(int ID, String date, double price) {
        this.ID = ID;
        this.date = date;
        this.price = price;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + getID() + "'" +
            ", date='" + getDate() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }
    
}
