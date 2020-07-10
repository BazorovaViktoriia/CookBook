package BookActions;
import BookForm.SoupListFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoupListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame soup = new JFrame("Супчики");
        soup.pack();
        soup.setVisible(true);

        SoupListFrame demo = new SoupListFrame(); // внешность формы
        soup.setContentPane(demo.createBreakfastListFrame()); // передаем как параметр в конструктор

        soup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        soup.setBounds(400, 200, 800,500);

    }
}