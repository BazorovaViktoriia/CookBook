package DishFrame;

import javax.swing.*;
import java.awt.*;

public class TostFrame {

    public JPanel createTost() {
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel label = new JLabel("Френч тост с яйцом пашот");
        label.setLocation(10, 10);
        label.setSize(300, 100);
        label.setHorizontalAlignment(0);
        label.setForeground(Color.blue);
        totalGUI.add(label);

        ImageIcon frtost = new ImageIcon("Franch_tost.png");
        JLabel label_ = new JLabel(frtost);
        totalGUI.add(label_).setBounds(100,100,100,100);

        return totalGUI;
    }
}
