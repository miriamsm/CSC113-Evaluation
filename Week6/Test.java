package Week6;

public class Test {
    public static void main(String [] args){
        int numofpopmovies=0;
Genere[] lstGenere= new Genere[3];
lstGenere[0]= new Action("Borne identity", 2014, 67, 100);
lstGenere[1]= new Action("Death Race", 2009, 48, 104);
lstGenere[2]=new Action("Speed", 2015, 98, 320);

for(int i=0;i<lstGenere.length;i++){
    System.out.println("Rating for "+((Movie)lstGenere[i]).getTitle()+" is : "+((Action)lstGenere[i]).calculateRating());
}
for(int i=0; i<lstGenere.length; i++){
    if (lstGenere[i].isPopualr()){
        System.out.println("");
    System.out.println("The popular movie : ");
    ((Movie)lstGenere[i]).display();
    numofpopmovies++;
}}
System.out.println("The number of popular movies is "+numofpopmovies);
    }
}
