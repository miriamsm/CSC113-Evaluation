package Week5;
public class Alligator extends Reptiles{
private double maxDepth;

    public Alligator(String n,double w,int r ,double maxDepth) {
        super(n,w,r);
        this.maxDepth = maxDepth;
    }
    public void sleep(){
        System.out.println("sleep 6-8 hours");
    }
    public boolean swimsDeep(){
        if (maxDepth>4)
        return true;
        return false;
    } 

    @Override
    public String toString() {
        return super.toString()+"{" +
            " maxDepth='" + getMaxDepth() + "'" +
            "}";
    }

    public double getMaxDepth() {
        return this.maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

}
