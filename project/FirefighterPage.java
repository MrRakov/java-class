import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class FirefighterPage extends JFrame {

    private ArrayList<Firefighter> firefighters;
    private JTextField searchField;
    private JTextArea area;
    private JButton btnBack;

    public FirefighterPage() {
        setTitle("Firefighters");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lbl = new JLabel("Firefighters:");
        lbl.setBounds(20, 20, 200, 30);
        add(lbl);

        searchField = new JTextField();
        searchField.setBounds(100, 20, 200, 30);
        add(searchField);

        area = new JTextArea();
        area.setBounds(20, 70, 340, 220);
        area.setEditable(false);
        add(area);

        btnBack = new JButton("Back");
        btnBack.setBounds(140, 310, 100, 30);
        add(btnBack);

        firefighters = new ArrayList<>();
        firefighters.add(new Firefighter(35, "Wolter White", "Captain"));
        firefighters.add(new Firefighter(29, "Jesse Pinkman", "Lieutenant"));
        firefighters.add(new Firefighter(32, "Tom Hanks", "Sergeant"));
        firefighters.add(new Firefighter(27, "SpiderMan", "Rookie"));
        firefighters.add(new Firefighter(41, "Selena Gomez", "Commander"));

        showAll();

        searchField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                search();
            }
        });

        btnBack.addActionListener(e -> dispose());
    }

    private void showAll() {
        area.setText("");
        for (Firefighter f : firefighters) {
            area.append(f.getName() + " (Rank: " + f.getRank() + ")\n");
        }
    }

    private void search() {
        String term = searchField.getText().toLowerCase();
        area.setText("");
        for (Firefighter f : firefighters) {
            if (f.getName().toLowerCase().contains(term)) {
                area.append(f.getName() + " (Rank: " + f.getRank() + ")\n");
            }
        }
    }
}
