package BookForm;

import BreakfastActions.PorrigeListener;
import BreakfastActions.TostListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BreakfastListFrame {
    public JPanel createBreakfastListFrame (){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel label = new JLabel("Рецепты идут в порядке увеличения ингредиентов");
        label.setLocation(10, 10);
        label.setSize(300, 100);
        label.setHorizontalAlignment(0);
        label.setForeground(Color.blue);
        totalGUI.add(label);


        JButton porrige = new JButton("Овсянка, сэр!");
        porrige.setLocation(100, 100);
        porrige.setSize(170,50 );
        ActionListener porrigeListener = new PorrigeListener();
        porrige.addActionListener(porrigeListener);
        totalGUI.add(porrige);


        JButton tost = new JButton("Френч тост с яйцом пашот");
        tost.setLocation(300, 300);
        tost.setSize(200, 50);
        ActionListener tostListener  = new TostListener();
        tost.addActionListener(tostListener);
        totalGUI.add(tost);

        totalGUI.setOpaque(true);
        return totalGUI;
    }
}

