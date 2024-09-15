import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn
{
        public static void main(String[] args) 
        {
            //jframe
            JFrame loginFrame = new JFrame("Login Form");
            loginFrame.setSize(400,300);
            loginFrame.setVisible(true);
            loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginFrame.setLocationRelativeTo(null);
            loginFrame.getContentPane().setBackground(Color.decode("#D2E0FB"));
            loginFrame.setLayout(null);

            //userlabel
            JLabel userLabel = new JLabel("Username : ");
            userLabel.setBounds(50, 50, 100, 30);
            
            //textfield for username
            JTextField userTextField = new JTextField();
            userTextField.setBounds(150, 50, 200, 30);

            //password
            JLabel passLabel = new JLabel("Password : ");
            passLabel.setBounds(50, 100, 100, 30);

            //password text field
            JPasswordField passField = new JPasswordField();
            passField.setBounds(150, 100, 200, 30);

            //Login button
            JButton logiButton = new JButton("Login");
            logiButton.setBounds(150, 150, 100, 50);

            //login button action listener
            logiButton.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    String username = userTextField.getText();
                    String password = new String(passField.getPassword());

                    String correctUsername = "Mahamud";
                    String correctPassword = "1234";

                    if(username.equals(correctUsername) && password.equals(correctPassword))
                    {
                        JOptionPane.showMessageDialog(loginFrame, "Login successful", "Login", JOptionPane.INFORMATION_MESSAGE);
                        openWelcomeFrame();
                        loginFrame.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(loginFrame, "Login unsuccessful", "Login", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            //adding to frame
            loginFrame.add(userLabel);
            loginFrame.add(userTextField);
            loginFrame.add(passLabel);
            loginFrame.add(passField);
            loginFrame.add(logiButton);
        }

        
        private static void openWelcomeFrame()
        {
            JFrame welcomeframe = new JFrame("Welcome");
            welcomeframe.setSize(400,300);
            welcomeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            welcomeframe.setLayout(null);
            welcomeframe.setLocationRelativeTo(null);
            welcomeframe.setVisible(true);
            welcomeframe.getContentPane().setBackground(Color.decode("#D2E0FB"));
        }
}
