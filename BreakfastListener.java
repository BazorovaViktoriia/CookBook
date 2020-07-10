package BookActions;

import BookForm.BreakfastListFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BreakfastListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame breakfast = new JFrame("Завтраки: от простого к сложному");
        breakfast.pack();
        breakfast.setVisible(true);

        BreakfastListFrame demo = new BreakfastListFrame(); // внешность формы
        breakfast.setContentPane(demo.createBreakfastListFrame()); // передаем как параметр в конструктор

        breakfast.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        breakfast.setBounds(400, 200, 800,500);

    }
}
