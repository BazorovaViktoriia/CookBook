package BookForm;
import BookActions.BreakfastListener;
import BookActions.MeatListener;
import BookActions.SoupListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class CookBookFrame extends JFrame {

    public CookBookFrame (){
        JFrame frame = new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 200, 700, 500);
        setTitle("Кулинарная книга");
        setContentPane(new Fon());

        Container cont = getContentPane();

        JLabel label = new JLabel("1Просто и со вкусом ");
        label.setLocation(10, 10);
        label.setSize(300, 100);
        cont.add(label); // добавляем текстовую метку на поверхность

        JButton breakfast = new JButton("Breakfast");
        breakfast.setLocation(100, 100);
        breakfast.setSize(200, 50);
        ActionListener breakfastListener = new BreakfastListener(); // создаём объект-обработчик события
        breakfast.addActionListener(breakfastListener);// назначаем этот обработчик кнопке
        cont.add(breakfast); // прикрепляем действие к кнопке (срабоет по нажатии на неё)

        JButton soup = new JButton("Soup");
        soup.setLocation(200, 200);
        soup.setSize(200, 50);
        ActionListener soupListener = new SoupListener();
        soup.addActionListener(soupListener);
        cont.add(soup);

        JButton meat = new JButton("Meat");
        meat.setLocation(300, 300);
        meat.setSize(200, 50);
        ActionListener meatListener = new MeatListener();
        meat.addActionListener(meatListener);
        cont.add(meat);

        setLayout(null);

    }
}
 class Fon extends JPanel {
    public void paintComponent(Graphics g) {
        ImageIcon fon_ = new ImageIcon("src/fon.jpg");
        Image fon = fon_.getImage();
        g.drawImage(fon, 0, 0, this);
    }
}


