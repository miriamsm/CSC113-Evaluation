// write your information
// Name : Miriam almogren
// ID : 443200568
public class Regular extends Order implements Discount {
    public Regular(int ID, String d, double p){
        super(ID, d, p);
    }
    public void applyDiscount(int dis){
        this.price=price-(price*rate[dis]);

    }
}
