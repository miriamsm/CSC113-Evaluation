package Week9;
import java.io.*; 
//Miriam Almogren, Sarah bin daej
    public class testItemFile{
        public static void main(String[] args) {
        Item t1 = new Item(1111 , 89 );
        Item t2 = new Item(22444 , 169 );
        Item t3 = new Item(66688 , 299 );
        try{
        File f = new File("Items.dat");
        FileOutputStream fos = new FileOutputStream (f);
        ObjectOutputStream oos = new ObjectOutputStream (fos);
        oos.writeObject(t1);
        oos.writeObject(t2);
        oos.writeObject(t3);
        oos.close();

        File f2 = new File("Report.txt") ;
        FileOutputStream sf = new FileOutputStream(f2) ;
        PrintWriter TextFile = new PrintWriter(sf) ;

        File f3 = new File("Items.dat");
        FileInputStream fi = new FileInputStream(f3);
        ObjectInputStream ObjectFile= new ObjectInputStream( fi);
        try{
        while(true)
        {
        Item obj = (Item) ObjectFile.readObject() ; 
        if( obj.price > 100 )
    TextFile.println( obj.barcode );
    }
    }catch(EOFException e )
    {
    
    }
    ObjectFile.close();
    TextFile.close();
    }
    catch(ClassNotFoundException ex )
    {
    System.out.println("Error casting while reading from file");
    }
    catch(IOException ex )
    {
    System.out.println("can't open object file ");
    }
    }
}
