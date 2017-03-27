package mt2.composite.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * User: ssen
 * Date: Mar 30, 2010
 * Time: 7:03:03 AM
 */
public class Composite extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JTextArea textArea1;

    public Composite(){
        setContentPane(panel1);
        pack();
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                traverseComponents(panel1);
            }
        });
    }

    private void traverseComponents(Container panel1) {

        // Get Container's child components
        Component[] children = panel1.getComponents();    


        for(Component child: children) {

            // Pre-order traverse


            if (child instanceof Container) {
                traverseComponents((Container) child);
            }
            textArea1.append(child.getClass().toString() + "\n");
        }
        
    }

    public static void main(String[] args){
        Composite com = new Composite();

    }
}
