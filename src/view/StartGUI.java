package view;

import control.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGUI {
    private JPanel panel;
    private JLabel label1;
    private JButton startenButton;
    private JButton buttonr;
    private MainController mc;

    public StartGUI(MainController mainController){
        label1.setFont(new Font("font", Font.PLAIN, 35));
        mc=mainController;
        buttons();


    }

    public void buttons(){
        buttonr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mc.next(2);
            }
        });
        startenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Spiel gestartet");
                mc.next(0);
            }
        });
    }
    public JPanel getPanel() {
        return panel;
    }
}
