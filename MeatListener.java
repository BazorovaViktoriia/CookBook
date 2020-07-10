package BookActions;

import BookForm.MeatListFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeatListener  implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame soup = new JFrame("Супчики");
        soup.pack();
        soup.setVisible(true);

        MeatListFrame demo = new MeatListFrame(); // внешность формы
        soup.setContentPane(demo.createMetListFrame()); // передаем как параметр в конструктор

        soup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        soup.setBounds(400, 200, 800,500);

    }
}
