package Interview;

class A{
    private String name;

    A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
class B extends A {
    private int roll;
    B(String name, int roll){
        super(name);
        this.roll = roll;
    }
    
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

}
public class StaticDemo {
    
    public static void main(String[] args) {
        // B b = new B("harshit", 123);
        // System.out.println(b.getName());
        // System.out.println(b.getRoll());
        Truck truck = new Truck();
        System.out.println(truck);
    }
}
