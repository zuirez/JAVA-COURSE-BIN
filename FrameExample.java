import java.awt.*;
import javax.swing.*;

public class FrameExample {

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("This is my first Frame"); 


        JLabel label1 = new JLabel("ENTER YOUR EMAIL : ");
        label1.setBounds(200, 100, 150, 30);
        label1.setForeground(Color.BLUE);
        label1.setOpaque(true);

        JLabel label2 = new JLabel("ENTER YOUR PASSWORD : ");
        label2.setBounds(200, 150, 250, 30);
        label2.setOpaque(true);

        JLabel label3 = new JLabel("ENTER YOUR GENDER : ");
        label3.setBounds(200, 200, 150, 30);
        label3.setOpaque(true);

        JLabel label4 = new JLabel("ENTER YOUR PIN : ");
        label4.setBounds(200, 250, 150, 30);
        label4.setOpaque(true);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        //frame.setBounds(200, 200, 400, 400);
        //frame.setResizable(false);
        //frame.setTitle("THIS IS TITLE");
    }
}