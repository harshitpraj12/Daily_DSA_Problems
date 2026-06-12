package InternalWorking;


class InnerMain {
    public void Sayhello(){
        System.out.println("Hello mr. X");
    }
    
}
public class Main{
    public static void main(String[] args){
        Student student = new Student("Ajay", 23);
        String ans = student.study();
        System.out.println(ans);
        student.play();
        student.dance();
        student.singing();
    }
}
