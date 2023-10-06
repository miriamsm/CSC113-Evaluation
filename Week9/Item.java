package Week9;
import java.io.*; 

public class Item implements Serializable{
int barcode , price;
public Item( int b , int p )
{
barcode = b;
price = p ;
}
public int getBarcode() {
    return barcode;
}
public void setBarcode(int barcode) {
    this.barcode = barcode;
}
public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}
} 