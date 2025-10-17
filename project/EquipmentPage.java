import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class EquipmentPage extends JFrame {
    private ArrayList<Firetruck> equipment;
    private JTextField searchField;
    private JList<String> list;
    private DefaultListModel<String> listModel;
    private JButton btnActivate, btnDeactivate, btnMaintain, btnBack;

    public EquipmentPage() {
        setTitle("Equipment");
        setSize(500, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lbl = new JLabel("Equipment:");
        lbl.setBounds(20, 20, 100, 30);
        add(lbl);

        searchField = new JTextField();
        searchField.setBounds(120, 20, 200, 30);
        add(searchField);

        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        JScrollPane scroll = new JScrollPane(list);
        scroll.setBounds(20, 70, 440, 220);
        add(scroll);

        btnActivate = new JButton("Activate");
        btnDeactivate = new JButton("Deactivate");
        btnMaintain = new JButton("Maintain");
        btnBack = new JButton("Back");

        btnActivate.setBounds(40, 310, 100, 30);
        btnDeactivate.setBounds(150, 310, 100, 30);
        
        btnMaintain.setBounds(260, 310, 100, 30);
        btnBack.setBounds(370, 310, 80, 30);

        add(btnActivate);
        add(btnDeactivate);
        add(btnMaintain);
        add(btnBack);

        equipment = new ArrayList<>();
        equipment.add(new Firetruck(101, "Mr.Hotwheels", 5551));
        equipment.add(new Firetruck(102, "WroomWrooms", 5552));
        equipment.add(new Firetruck(103, "SonOfACar", 5553));
        equipment.add(new Firetruck(104, "supertruck", 5554));

        updateList();

        searchField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                search();
            }
        });

        btnActivate.addActionListener(e -> changeStatus(Status.Active));
        btnDeactivate.addActionListener(e -> changeStatus(Status.Inactive));
        btnMaintain.addActionListener(e -> changeStatus(Status.Maintains));
        btnBack.addActionListener(e -> dispose());
    }

    private void updateList() {
        listModel.clear();
        for (Firetruck eq : equipment) {
            listModel.addElement(eq.getEqupimentName() + " — Status: " + eq.getStatus());
        }
    }

    private void search() {
        String term = searchField.getText().toLowerCase();
        listModel.clear();
        for (Firetruck eq : equipment) {
            if (eq.getEqupimentName().toLowerCase().contains(term)) {
                listModel.addElement(eq.getEqupimentName() + " — Status: " + eq.getStatus());
            }
        }
    }

    private void changeStatus(Status newStatus) {
        int index = list.getSelectedIndex();
        if (index >= 0) {
            String term = searchField.getText().toLowerCase();
            int realIndex = -1;
            for (int i = 0; i < equipment.size(); i++) {
                if (equipment.get(i).getEqupimentName().toLowerCase().contains(term)) {
                    realIndex++;
                    if (realIndex == index) {
                        equipment.get(i).status = newStatus;
                        break;
                    }
                }
            }

            if (term.isEmpty()) {
                equipment.get(index).status = newStatus;
            }

            updateList();
            search();
        }
    }
}


