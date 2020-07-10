package BookForm;
import BookActions.BreakfastListener;
import BookActions.MeatListener;
import BookActions.SoupListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CookBookFrame  {

    public JPanel createContentPane (){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JLabel label = new JLabel("1Просто и со вкусом " );
        label.setLocation(10, 10);
        label.setSize(300, 100);
        label.setHorizontalAlignment(0);
        label.setForeground(Color.blue);
        totalGUI.add(label); // добавляем текстовую метку на поверхность


        JButton breakfast = new JButton("Breakfast");
        breakfast.setLocation(100, 100);
        breakfast.setSize(200,50 );
        // создаём объект-обработчик события
        ActionListener breakfastListener = new BreakfastListener(); // создаём  действие
        // назначаем этот обработчик кнопке
        breakfast.addActionListener(breakfastListener);// прикрепляем действие к кнопке (срабоет по нажатии на неё)
        totalGUI.add(breakfast);

        JButton soup = new JButton("Soup");
        soup.setLocation(200, 200);
        soup.setSize(200, 50 );
        ActionListener soupListener = new SoupListener();
        soup.addActionListener(soupListener);
        totalGUI.add(soup);

        JButton meat = new JButton("Meat");
        meat.setLocation(300, 300);
        meat.setSize(200, 50);
        ActionListener meatListener  = new MeatListener();
        meat.addActionListener(meatListener);
        totalGUI.add(meat);

        totalGUI.setOpaque(true);
        return totalGUI;
    }
}
