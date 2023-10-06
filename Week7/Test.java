package Week7;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);

        Pastry []paslist= new Pastry[3];

        for(int i=0; i<2; i++){
        System.out.println("Enter production date: ");
        String productiond=input.next();
        System.out.println("Enter expire date: ");
        String expired=input.next();
        int q=0;
        boolean Enter=true;
        while(Enter){
            try{
                System.out.println("Enter quantity: ");
                q=input.nextInt();
                Enter=false;
            }
            catch(InputMismatchException ex){
                System.out.println("Enter a valid number:");
                input.nextInt();
            }}
            System.out.println("Enter a flavor: ");
            String flav=input.next();
            paslist[i]=new Cake(productiond,expired,q,flav);
    }
    for(int i=0; i<2; i++){
        System.out.println(paslist[i].toString());
    }
    ((Cake)paslist[0]).writeName("Miriam");
    ((Cake)paslist[1]).writeName(null);


}}
