package view;

import control.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegelGUI {
    private JPanel panelr;
    private JButton zurückButton;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private MainController mc;
    public RegelGUI(MainController mainController){
        mc=mainController;
        label1.setFont(new Font("font", Font.PLAIN, 25));
        label2.setFont(new Font("font", Font.PLAIN, 25));
        label3.setFont(new Font("font", Font.PLAIN, 25));
        label4.setFont(new Font("font", Font.PLAIN, 25));
        label5.setFont(new Font("font", Font.PLAIN, 25));
        zurückButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mc.next(3);
            }
        });
    }

    public JPanel getPanelr() {
        return panelr;
    }
}
