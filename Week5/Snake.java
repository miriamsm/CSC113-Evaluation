package Week5;
public class Snake extends Reptiles{
    public Snake(String n, double w, int r){
        super(n,w,r);
    }
    public void sleep(){
        System.out.println("Sleep at least 16 hours");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    

}