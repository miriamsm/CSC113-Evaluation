package Week7;

public class Pastry {
    private String pDate;
    private String eDate;
    private int quantity;

    public Pastry(String pDate, String eDate, int quantity) {
        this.pDate = pDate;
        this.eDate = eDate;
        this.quantity = quantity;
    }

    public String getPDate() {
        return this.pDate;
    }

    public void setPDate(String pDate) {
        this.pDate = pDate;
    }

    public String getEDate() {
        return this.eDate;
    }

    public void setEDate(String eDate) {
        this.eDate = eDate;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "{" +
            " pDate='" + getPDate() + "'" +
            ", eDate='" + getEDate() + "'" +
            ", quantity='" + getQuantity() + "'" +
            "}";
    }
    
}
