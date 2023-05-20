package MenuView;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JFrame {
    private JLabel logo;
    private JLabel optiontxt;
    private JButton subjectView;
    private JButton subjectGradesView;
    private JButton editCourseView;
    private JButton editGradesView;

    public MenuView() {
        initializeComponents();
        setupLayout();
    }

    private void initializeComponents() {
        logo = new JLabel();
        logo.setIcon(new ImageIcon("src/LoginView/Saint_Louis_University_PH_Logo.svg (2).png"));
        logo.setHorizontalAlignment(SwingConstants.CENTER);

        optiontxt = new JLabel("Please select an option");
        optiontxt.setFont(new Font("Arial Black", Font.BOLD, 20));

        subjectView = new JButton("Subjects");
        subjectGradesView = new JButton("Subject Grades");
        editCourseView = new JButton("Edit Courses");
        editGradesView = new JButton("Edit Grades");
    }

    private void setupLayout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menu View");

        setLayout(new GridLayout(1, 2));

        JPanel iconPanel = new JPanel(new GridLayout(2, 1));
        iconPanel.setBackground(new Color(-13144133));
        iconPanel.add(logo);
        iconPanel.add(optiontxt);

        JPanel menuPanel = new JPanel(new GridLayout(4, 1));
        menuPanel.add(subjectView);
        menuPanel.add(subjectGradesView);
        menuPanel.add(editCourseView);
        menuPanel.add(editGradesView);

        add(iconPanel);
        add(menuPanel);

        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuView());
    }
}
