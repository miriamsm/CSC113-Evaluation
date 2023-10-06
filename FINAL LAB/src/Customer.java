import java.io.File;
import java.io.FileNotFoundException;
import java.lang.invoke.TypeDescriptor.OfMethod;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

// write your information
// Name : Miriam almogren
// ID : 443200568
// Lab instructor :

//------------------------ class Customer -------------------

class Customer implements InputOutput {
    private String name;
	private Order []oList;
	private int nO;
    public Customer(String n , int size){
    	name=n;
    	oList= new Order[size];
    }

    public String getname() {return name;}
    
    /* adds the received order to the customer in the first empty location in oList 
     * if the order was not already in the list , if the order was already added in the list ,
     *  then the method will update the price and date of the order in the list 
     *  the method  returns true if the process is completed successfully, or false otherwise. 
     *  Hint: use the ID to check if the order is already in oList or not.*/
  
    public boolean addOrder(Order b) {
        for(int i=0;i<nO;i++){
            if(b.ID==oList[i].ID)
            {
                b.price=oList[i].price;
                b.date=oList[i].date;
                return true;
            }
        }
        if(nO<=oList.length){
        oList[nO++]=b;
        return true;}
        else
        return false;

    

    	   }
    	
/*counts the number of special order with occasion equals to occ. 
 *The method should check if the received occasion (occ), if it is not â€œRamadanâ€ or â€œEidâ€,
 *a user-defined unchecked exception named â€œIncorrectOccasionâ€ should be thrown and handled (caught)
 *in the method; the returned value should be -1. 
*/ 
 public int countSpecial throws IncorrectOccasion(String occ){
	 if(!(occ.equals("Ramadan")||occ.equals("Eid"))){
     throw new IncorrectOccasion();
     return-1;}

     int c=0;
     for(int i=0;i<oList.length;i++){
        if(oList[i].instanceOf(Special)){
        if(oList[i].getOccasion().equals(occ))
        c++;}
     }
     return c;
    }
     
 
 

//returns the price of all orders in the array
 public double calculatePrice(){ 
	 double total=0;
	 for(int i=0 ; i<nO ; i++)
		 total=total+oList[i].getPrice();
	 return total;
   }
 public void ReadOrders(String filename){
    try{
    File f=new File("filename");
    Scanner iScanner=new Scanner(f);
    while(iScanner.hasNext()){
    int id=iScanner.nextInt();
String date=iScanner.next();
double price=iScanner.nextDouble();
Order o=new Order(id,date,price); 
oList[nO++]=o;
{
    
};}}catch(FileNotFoundException e){
    System.out.println(e);
}
 }
public void display() {
     System.out.println("customer "+name +" has "+nO+" Orders");
	 for(int i=0 ; i<nO ; i++)
	    System.out.println(oList[i]);
	}

}//end class Customer
