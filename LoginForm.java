import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args) {
        // Create the login frame
        JFrame loginFrame = new JFrame("Login Form");
        loginFrame.getContentPane().setBackground(new Color(60, 179, 113));  // Medium Sea Green
        loginFrame.setSize(400, 300);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);
        loginFrame.setLocationRelativeTo(null);

        // Username Label
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        userLabel.setFont(new Font("Arial", Font.BOLD, 14));
        userLabel.setForeground(Color.WHITE);

        // Username TextField
        JTextField userTextField = new JTextField();
        userTextField.setBounds(150, 50, 200, 30);

        // Password Label
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        passLabel.setFont(new Font("Arial", Font.BOLD, 14));
        passLabel.setForeground(Color.WHITE);

        // Password Field
        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 100, 200, 30);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setBackground(new Color(0, 123, 255));  // Bootstrap Blue
        loginButton.setForeground(Color.WHITE);

        // Action listener for the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                String password = new String(passField.getPassword());

                // Correct credentials (hardcoded)
                String correctUsername = "admin";
                String correctPassword = "password123";

                // Check if username and password match
                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    JOptionPane.showMessageDialog(loginFrame, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    // Open the new Welcome frame
                    openWelcomeFrame();
                    loginFrame.dispose();  // Close the login frame
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add components to the login frame
        loginFrame.add(userLabel);
        loginFrame.add(userTextField);
        loginFrame.add(passLabel);
        loginFrame.add(passField);
        loginFrame.add(loginButton);

        loginFrame.setVisible(true);
    }

    // Method to open a new frame with "Welcome" message
    private static void openWelcomeFrame() {
        JFrame welcomeFrame = new JFrame("Welcome");
        welcomeFrame.setSize(300, 200);
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setLayout(new BorderLayout());
        welcomeFrame.setLocationRelativeTo(null);

        // Welcome label
        JLabel welcomeLabel = new JLabel("Welcome!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeFrame.add(welcomeLabel, BorderLayout.CENTER);

        welcomeFrame.setVisible(true);
    }
}
