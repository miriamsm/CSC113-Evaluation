package Week5;

public class Test{
    public static void main(String [] args){
        Animal Animallist[]=new Animal[3];
        Animallist[0]=new Alligator("Alligator_1",360,10,2.7);
        Animallist[1]=new Snake("Snake_1",100,20);
        Animallist[2]=new Snake("Snake_2",150,30);
        for(int i=0; i<Animallist.length;i++){
            if (Animallist[i] instanceof Alligator){
                if (((Alligator)(Animallist[i])).swimsDeep())
            System.out.println("Alligator swims deep");
            else
            System.out.println("Alligator doesn't swim deep");}
            Animallist[i].sleep();
        }
        
        for(int i=0; i<Animallist.length;i++)
        System.out.println(Animallist[i].toString());
    }
}