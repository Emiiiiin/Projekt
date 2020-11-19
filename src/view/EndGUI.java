package view;

import control.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndGUI {
    private JLabel label2;
    private JLabel label1;
    private JPanel panel;
    private JButton schließenButton;
    private MainController mc;

    public EndGUI(MainController mainController){
        mc=mainController;
        label1.setFont(new Font("font", Font.PLAIN, 35));
        label2.setFont(new Font("font", Font.PLAIN, 35));

        schließenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mc.close();
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}
