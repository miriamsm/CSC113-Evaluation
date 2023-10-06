// write your information
// Name : Miriam almogren
// ID : 443200568
public class Special extends Order {
    private String occasion;
    Special(int ID, String d, double p, String o){
        super(ID, d, p);
        this.occasion=o;
    }

    public String getOccasion() {
        return this.occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    @Override
    public String toString() {
        return "{" +
            " occasion='" + getOccasion() + "'" +
            "}";
    }

}
