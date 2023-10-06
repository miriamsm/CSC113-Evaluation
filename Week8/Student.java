package Week8;

public class Student extends Person {
    private int ISD;
    private int level;

    public Student(String name, int NID, int age, int ISD, int level) {
        super(name, NID, age);
        this.ISD = ISD;
        this.level = level;
    }

    public double calculateGPA(String point, int hours) {
        int p = Integer.parseInt(point);
        return p / hours;
    }

    public int getISD() {
        return this.ISD;
    }

    public void setISD(int ISD) {
        this.ISD = ISD;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
            " ISD='" + getISD() + "'" +
            ", level='" + getLevel() + "'" +
            "}";
    }

}
