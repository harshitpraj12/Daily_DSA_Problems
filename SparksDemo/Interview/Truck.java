package Interview;

public class Truck {
    private String name;
    private int rollno;
    public Truck(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    public Truck() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    @Override
    public String toString() {
        return "Truck [name=" + name + ", rollno=" + rollno + "]";
    }
    
}
