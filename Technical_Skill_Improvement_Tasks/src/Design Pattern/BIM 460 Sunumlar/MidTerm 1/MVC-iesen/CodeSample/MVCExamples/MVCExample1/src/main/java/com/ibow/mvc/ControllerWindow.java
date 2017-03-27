package com.ibow.mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * User: ibow
 * Date: 19.Þub.2010
 * Time: 20:42:23
 */
public class ControllerWindow extends JFrame {


    // View
    private ViewWindow view;

    // Model
    private Car car;

    public ControllerWindow(ViewWindow viewWindow, Car model) {
        this.view = viewWindow;
        this.car = model;

        JPanel panel = new JPanel();

        JButton accelarateButton = new JButton("+");
        JButton decelarateButton = new JButton("-");
        accelarateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Change Model
                car.setSpeed(car.getSpeed() + 10);
                // Update view
                view.repaint();

            }
        });
        decelarateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car.setSpeed(car.getSpeed() - 10);

                view.repaint();

            }
        });

        panel.add(accelarateButton);
        panel.add(decelarateButton);
        this.add(panel);

        this.setBounds(100, 150, 100, 100);
        this.setMinimumSize(new Dimension(100, 100));
        this.setTitle("Controller");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
