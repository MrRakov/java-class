import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {

    private JButton btnFirefighters;
    private JButton btnDispatchers;
    private JButton btnEquipment;
    private JButton btnExit;

    public MainMenu() {
        setTitle("Fire Department Management System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel title = new JLabel("Main Menu");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(120, 30, 300, 40);
        add(title);

        btnFirefighters = new JButton("Manage Firefighters");
        btnDispatchers = new JButton("Manage Dispatchers");
        btnEquipment = new JButton("Manage Equipment");
        btnExit = new JButton("Exit");
        btnFirefighters.setBounds(100, 100, 200, 40);
        btnDispatchers.setBounds(100, 150, 200, 40);
        btnEquipment.setBounds(100, 200, 200, 40);
        btnExit.setBounds(100, 250, 200, 40);

        add(btnFirefighters);
        add(btnDispatchers);
        add(btnEquipment);
        add(btnExit);

        
        btnFirefighters.addActionListener(e -> new FirefighterPage().setVisible(true));
        btnDispatchers.addActionListener(e -> new DispatcherPage().setVisible(true));
        btnEquipment.addActionListener(e -> new EquipmentPage().setVisible(true));
        btnExit.addActionListener(e -> System.exit(0));
    }

    
    public static void main(String[] args) {
        new MainMenu().setVisible(true);
    }
}

