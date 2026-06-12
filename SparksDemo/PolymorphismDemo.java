// package SparksDemo;

// Objects are created at runtime not on compile time 

class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        // This is called Polymorphism where a class can access same method of another class
        // ? Here class Circle had extended Shape and @Override draw method of Shape class 
        // and here Shape had created object of Circle class

        Shape shape1 = new Circle();
        shape1.draw();

        // Another Example

        Shape shape2 = new Rectangle();
        shape2.draw();

        Shape shape3 = new Shape();
        shape3.draw();
    }
}
