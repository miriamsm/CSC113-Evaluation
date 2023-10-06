package Week6;

public class Action extends Movie implements Genere {

    public Action(String i,int y, int c, int p) {
        super(i,y,c,p);
    }
    public boolean isPopualr(){
        if(calculateRating()>3.5)
        return true;
        return false;
    }
    public double calculateRating(){
        double rating =(double)(posVote+critics)/(double)critics;
        return rating;
    }
    public void display(){
        super.display();
    }

}

