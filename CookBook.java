package BookForm;

import javax.swing.*;

public class CookBook extends JFrame  {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame book = new JFrame("Кулинарная книга");

        CookBookFrame  demo = new CookBookFrame(); // внешность формы
        book.setContentPane(demo.createContentPane()); // передаем как параметр в конструктор

        book.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        book.setBounds(400, 200, 800,500);
        book.setVisible(true);
    }
}
