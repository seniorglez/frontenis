/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author diego
 */
public class GameFrame extends JFrame{
    private static GPanel gp =new GPanel();
    public GameFrame(){
        this.setVisible(true);
        this.setSize(new Dimension(300,300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Frontenis");
        this.getContentPane().add(gp);
    }
    public static void main(String[] args) throws InterruptedException {
        GameFrame gf = new GameFrame();
        while (true){
            gp.moveBall();//update
            gp.repaint();//render
            Thread.sleep(10);
            
        }
    }
}
