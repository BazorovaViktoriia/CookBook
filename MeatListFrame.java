package BookForm;

import MeatActions.ChickenListener;
import MeatActions.CutletsListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MeatListFrame {
    public JPanel createMetListFrame() {

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel label = new JLabel("Что-нибудь написать");
        label.setLocation(10, 10);
        label.setSize(300, 100);
        label.setHorizontalAlignment(0);
        label.setForeground(Color.blue);
        totalGUI.add(label);


        JButton chicken = new JButton("Куриный шницель!");
        chicken.setLocation(100, 100);
        chicken.setSize(170, 50);
        ActionListener chickenListener = new ChickenListener();
        chicken.addActionListener(chickenListener);
        totalGUI.add(chicken);


        JButton cutlets = new JButton("Мясные зразы");
        cutlets.setLocation(300, 300);
        cutlets.setSize(200, 50);
        ActionListener cutletsListener = new CutletsListener();
        cutlets.addActionListener(cutletsListener);
        totalGUI.add(cutlets);

        totalGUI.setOpaque(true);
        return totalGUI;
    }
}
