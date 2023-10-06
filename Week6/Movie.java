package Week6;

public abstract class Movie{
    protected String title;
    protected int year;
    protected int critics;
    protected int posVote;

    public Movie(String title, int year, int critics, int posVote) {
        this.title = title;
        this.year = year;
        this.critics = critics;
        this.posVote = posVote;
    }
public abstract double calculateRating();
public void display(){
    System.out.println("");
    System.out.println("The title is "+title);
    System.out.println("The year is "+year);
    System.out.println("The critics is "+critics);
    System.out.println("The post vote is "+posVote);
    System.out.println("");
}


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCritics() {
        return this.critics;
    }

    public void setCritics(int critics) {
        this.critics = critics;
    }

    public int getPosVote() {
        return this.posVote;
    }

    public void setPosVote(int posVote) {
        this.posVote = posVote;
    }

}