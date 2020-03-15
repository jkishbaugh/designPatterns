import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
    JFrame jframe;
    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go(){
        jframe = new JFrame();
        
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event->
                System.out.println("Don't do it please!!!"));
        button.addActionListener(event ->
                System.out.println("Do it already!"));

        jframe.getContentPane().add(BorderLayout.CENTER, button);

        // Set jframe properties 
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.getContentPane().add(BorderLayout.CENTER, button);
        jframe.setSize(300,300);
        jframe.setVisible(true);
    }
}
