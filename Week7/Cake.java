package Week7;
import java.util.Scanner;
import javax.swing.InputMap;

public class Cake extends Pastry {
    private String falvor;
    private String writing;
    Scanner input=new Scanner(System.in);

    public Cake(String p,String e,int q,String f){
        super(p,e,q);
        falvor=f;
    }
    public void writeName(String name){
        boolean Enter=true;
        while(Enter){
        try{
            if(name.length()<13)
            writing=name;
            Enter=false;
        }
        catch(NullPointerException ex){
            System.out.println("Please enter a valid name: ");
            name=input.next();
        }
        }
    }

    public String getFalvor() {
        return this.falvor;
    }

    public void setFalvor(String falvor) {
        this.falvor = falvor;
    }

    public String getWriting() {
        return this.writing;
    }

    public void setWriting(String writing) {
        this.writing = writing;
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
            " falvor='" + getFalvor() + "'" +
            "'" +
            "}";
    }

}
