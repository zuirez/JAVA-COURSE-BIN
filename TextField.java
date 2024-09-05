import javax.swing.*;

public class TextField {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        JTextField text = new JTextField("Enter Your password : ");

        frame.add(text);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setBounds(200, 200, 400, 400);
        //frame.setResizable(false);
        frame.setTitle("THIS IS TEXTFIELD");
    }
}
