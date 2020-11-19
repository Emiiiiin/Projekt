
package control;

import view.*;
import model.*;
import javax.swing.*;
import java.awt.event.WindowEvent;

public class MainController {
    private MainFrame mainFrame;
    private StartGUI startGUI;
    private GameGUI gameGUI;
    private EndGUI endGUI;
    private Player player;
    private Enemy enemy;
    private RegelGUI regelGUI;

    public MainController(){
        endGUI = new EndGUI(this);
        startGUI = new StartGUI(this);
        gameGUI = new GameGUI(this);
        regelGUI = new RegelGUI(this);
        player = new Player();
        enemy = new Enemy();
        mainFrame = new MainFrame(this, startGUI.getPanel());
    }
    public void next(int x){
        JPanel panel1=gameGUI.getPanelg();
        if(x==1){
            panel1= endGUI.getPanel();
        }else if(x==2){
            panel1=regelGUI.getPanelr();
        }else if(x==3){
            panel1=startGUI.getPanel();
        }
        mainFrame.switchToPanel(panel1);
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public void close(){
        mainFrame.dispatchEvent(new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING));
    }

    public void attack() {
        enemy.setHp(-1);
        check();
    }
    public void check(){
        int x=enemy.getHp();
        if(x<2){
            mainFrame.switchToPanel(endGUI.getPanel());
        }
    }
}
