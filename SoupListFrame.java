package BookForm;

import SoupActions.FishSoupListener;
import SoupActions.TomatoSoupListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SoupListFrame {
    public JPanel createBreakfastListFrame (){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel label = new JLabel("Чего-нибудь написать");
        label.setLocation(10, 10);
        label.setSize(300, 100);
        label.setHorizontalAlignment(0);
        label.setForeground(Color.blue);
        totalGUI.add(label);


        JButton fishSoup = new JButton("Уха по-фински");
        fishSoup.setLocation(100, 100);
        fishSoup.setSize(170,50 );
        ActionListener fishSoupListener = new FishSoupListener();
        fishSoup.addActionListener(fishSoupListener);
        totalGUI.add(fishSoup);

        JButton tomatoSoup = new JButton("Томатный суп");
        tomatoSoup.setLocation(300, 300);
        tomatoSoup.setSize(200, 50);
        ActionListener tomatoSoupListener  = new TomatoSoupListener();
        tomatoSoup.addActionListener(tomatoSoupListener);
        totalGUI.add(tomatoSoup);

        totalGUI.setOpaque(true);
        return totalGUI;
    }
}