package Modifier;


class PublicDemo{
    public String name;
    PublicDemo(String name){
        this.name = name;
    }
    void display(){
        System.out.println("I'm "+ name+"!");
    }
}
class PrivateDemo{
    private String name;
    // PrivateDemo(String name){
    //     this.name = name;
    // }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
}
public class Public {
    public static void main(String[] args) {
        PublicDemo publicDemo = new PublicDemo("Harshit");
        publicDemo.display();
        PrivateDemo privateDemo = new PrivateDemo();
        privateDemo.setName("Vinod");
        System.out.println(privateDemo.getName());
        // privateDemo.name="Raj";

    }
}
