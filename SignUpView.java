package SignUpView;

import javax.swing.*;
import java.awt.*;

public class SignUpView extends JFrame {
    private JLabel logo;
    private JLabel signtxt;
    private JLabel name;
    private JTextField username;
    private JLabel pass;
    private JPasswordField password;
    private JLabel confirmpass;
    private JPasswordField confirmpassword;
    private JButton signUp;
    private JButton cancelButton;

    public SignUpView() {
        initializeComponents();
        setupLayout();
        setTitle("Sign Up");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeComponents() {
        logo = new JLabel(new ImageIcon("src/LoginView/Saint_Louis_University_PH_Logo.svg (2).png"));
        signtxt = new JLabel("Please enter the\n designated credentials");
        name = new JLabel("Username:");
        username = new JTextField(20);
        pass = new JLabel("Password:");
        password = new JPasswordField(20);
        confirmpass = new JLabel("Confirm Password:");
        confirmpassword = new JPasswordField(20);
        signUp = new JButton("Sign Up");
        cancelButton = new JButton("Cancel");
    }

    private void setupLayout() {
        setLayout(new GridLayout(1, 2));

        JPanel iconPanel = new JPanel(new GridLayout(2, 1));
        iconPanel.setBackground(new Color(-13144133));
        iconPanel.add(logo);
        iconPanel.add(signtxt);

        JPanel userPanel = new JPanel(new GridLayout(9, 1));
        userPanel.add(name);
        userPanel.add(username);
        userPanel.add(pass);
        userPanel.add(password);
        userPanel.add(confirmpass);
        userPanel.add(confirmpassword);
        userPanel.add(signUp);
        userPanel.add(cancelButton);

        add(iconPanel);
        add(userPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SignUpView::new);
    }
}
