package BreakfastActions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TostListener implements ActionListener {
    private  Image tost;
    @Override
    public void actionPerformed(ActionEvent e) {
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel label = new JLabel("Френч тост с яйцом пашот");
        label.setLocation(10, 10);
        label.setSize(300, 100);
        label.setHorizontalAlignment(0);
        label.setForeground(Color.blue);
        totalGUI.add(label);
        ImageIcon frtost = new ImageIcon("Franch_tost.png");
        label.setIcon(frtost);


    }
}
