/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author diego
 */
public class GameFrame extends JFrame{
    private static GPanel gp =new GPanel();
    private Toolkit myMonitor=Toolkit.getDefaultToolkit();
    private Dimension monitorSize=myMonitor.getScreenSize();
    public GameFrame(){
        this.setVisible(true);
        this.setLocation(new Point((int)monitorSize.getWidth()/2-150,(int)monitorSize.getHeight()/2-150));//coloca el frame centrado en la pantalla
        this.setSize(new Dimension(300,300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Frontenis");
        this.getContentPane().add(gp);
    }
    public static void main(String[] args) throws InterruptedException {
        GameFrame gf = new GameFrame();
        while (true){
            gp.moveBall();//update
            gp.repaint();//render, this method causes a call to this component's paint method as soon as possible.
            
            Thread.sleep(10);
            
        }
    }
}
