package mt1.mvc.ex1.mvc;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: ibow
 * Date: 19.Þub.2010
 * Time: 20:37:08
 */
public class ViewWindow extends JFrame {


    // Model
    private Car car;


    private JLabel label;

    public ViewWindow(Car car) {

        JPanel panel = new JPanel();

        this.car = car;
        this.label = new JLabel("Hello again swing!!");
        JLabel nameLabel = new JLabel(this.car.getName());


        panel.add(label);
        panel.add(nameLabel);
        this.add(panel);

        this.setBounds(300, 150, 100, 100);
        this.setMinimumSize(new Dimension(100, 100));
        this.setTitle("View");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Display updated model state
        this.label.setText(String.valueOf(this.car.getSpeed()));
    }


}
