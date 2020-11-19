package view;

import control.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI {
    private JPanel panelg;
    private JLabel label1;
    private JButton angriff;
    private JButton weiterButton;
    private JLabel label2;
    private JLabel label3;
    private JButton endButton;
    private MainController mc;
    private int a=1;
    private int y=0;

    public int getX() {
        return x;
    }

    private int x;

    public GameGUI(MainController mainController){
        mc= mainController;
        label1.setFont(new Font("font", Font.PLAIN, 35));
        label2.setFont(new Font("font", Font.PLAIN, 35));
        label3.setFont(new Font("font", Font.PLAIN, 35));
        label2.setText("Greif an!");
        buttons();


    }

    public void buttons(){
        angriff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(a>=0) {
                    x++;
                    if (x == 5) {
                        label2.setText("1. Wächter besiegt!");
                        a = 0;
                    } else if (x == 10) {
                        label2.setText("2. Wächter besiegt!");
                        a = 0;
                    } else if (x == 15) {
                        label2.setText("Du hast es geschafft!");
                        label3.setText("Nur noch 1 Schritt!");
                        y=2;
                    }
                }
            }
        });
        weiterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=1;
                if(y==2){
                    mc.next(1);
                }
            }
        });
    }

    public JPanel getPanelg() {
        return panelg;
    }
}
