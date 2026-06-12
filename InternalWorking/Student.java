package InternalWorking;

public class Student extends Hello{
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    String study() {
        String a = name + " is studing and his age is " + age;
        return a;
    }
}
