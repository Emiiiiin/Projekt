package view;

import control.MainController;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame(MainController mainController,JPanel panel1){
        frame(mainController,panel1);
    }
    public void frame(MainController mainController, JPanel panel1){
        this.setTitle("Emins Textspiel");
        this.setBounds(200,50,750,750);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setContentPane(panel1);
        this.setVisible(true);
    }
    public void switchToPanel(JPanel panel){
        this.setContentPane(panel);
        this.invalidate();
        this.validate();
    }
}
