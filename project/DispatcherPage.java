import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DispatcherPage extends JFrame {

    private ArrayList<Dispatcher> dispatchers;
    private JTextField searchField;
    private JTextArea area;
    private JButton btnBack;

    public DispatcherPage() {
        setTitle("Dispatchers");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lbl = new JLabel("Dispatchers:");
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

        dispatchers = new ArrayList<>();
        dispatchers.add(new Dispatcher(40, "Samuel Beacon", 10));
        dispatchers.add(new Dispatcher(38, "Emma Siren", 8));
        dispatchers.add(new Dispatcher(45, "Leonardo Signal", 15));
        dispatchers.add(new Dispatcher(33, "Keanu Alert", 6));

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
        for (Dispatcher d : dispatchers) {
            area.append(d.getName() + " (Experience: " + d.getExpirience() + " years)\n");
        }
    }

    private void search() {
        String term = searchField.getText().toLowerCase();
        area.setText("");
        for (Dispatcher d : dispatchers) {
            if (d.getName().toLowerCase().contains(term)) {
                area.append(d.getName() + " (Experience: " + d.getExpirience() + " years)\n");
            }
        }
    }
}
