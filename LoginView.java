package LoginView;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    private JLabel iconImg;
    private JLabel greetTxt;
    private JLabel username;
    private JTextField userText;
    private JLabel password;
    private JPasswordField passText;
    private JButton logIn;
    private JLabel signTxt;
    private JButton signUpButton;

    public LoginView() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login Form");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 1));

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(1, 2));

        JPanel iconPanel = new JPanel();
        iconPanel.setLayout(new GridLayout(2, 1));
        iconPanel.setBackground(new Color(-13144133));

        iconImg = new JLabel();
        iconImg.setIcon(new ImageIcon("src/LoginView/Saint_Louis_University_PH_Logo.svg (2).png"));
        iconImg.setText("");
        iconPanel.add(iconImg);

        greetTxt = new JLabel();
        greetTxt.setFont(new Font("Arial Black", Font.BOLD, 24));
        greetTxt.setForeground(new Color(-196614));
        greetTxt.setText("Welcome \nUser!");
        iconPanel.add(greetTxt);

        formPanel.add(iconPanel);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(8, 1));

        username = new JLabel("Username:");
        inputPanel.add(username);

        inputPanel.add(new JPanel()); // Spacer

        userText = new JTextField();
        userText.setPreferredSize(new Dimension(150, -1));
        inputPanel.add(userText);

        password = new JLabel("Password:");
        inputPanel.add(password);

        passText = new JPasswordField();
        passText.setPreferredSize(new Dimension(150, -1));
        inputPanel.add(passText);

        logIn = new JButton("Log In");
        inputPanel.add(logIn);

        signTxt = new JLabel("Don't have an account? Sign up now!");
        inputPanel.add(signTxt);

        signUpButton = new JButton("Sign Up");
        inputPanel.add(signUpButton);

        formPanel.add(inputPanel);

        mainPanel.add(formPanel);
        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginView::new);
    }
}

