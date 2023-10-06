package Week8;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);

    Person plist[]=new Person[3];

    for(int i=0; i<2;i++){
        System.out.println("Enter Name, NID, SID, level");
String n= input.next();
int NID= input.nextInt();
int SID= input.nextInt();
int l= input.nextInt();
System.out.println("Enter Points and hours");
String p= input.next();
int h= input.nextInt();
int a=0;
boolean T=true;
while(T){
    try{
        System.out.println("Enter age");
        a = input.nextInt();
        plist[i]=new Student(n,NID,a,SID,l);
        T=false;
        }
        catch(NegativeNumberException e){
            System.out.println(e.toString());}

    }}

    System.out.println(plist[0].toString());
    System.out.println(plist[1].toString());
    }}
