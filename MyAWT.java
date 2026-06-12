import java.awt.*;
import java.awt.event.*;

public class MyAWT extends Frame {
    MyAWT(){
        Button b = new Button("Click me");
        b.setBounds(100, 100, 80, 30);
        add(b);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyAWT();
    }
    
}
