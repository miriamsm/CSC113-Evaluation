package Week8;

public class Person {
    private String name;
    private int NID;
    private int age;

    public Person(String name, int NID, int age) throws NegativeNumberException{
        this.name = name;
        this.NID = NID;
        if (age>0)
        this.age = age;
        else 
        throw new NegativeNumberException("Invalid quantity");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNID() {
        return this.NID;
    }

    public void setNID(int NID) {
        this.NID = NID;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", NID='" + getNID() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

    
}
