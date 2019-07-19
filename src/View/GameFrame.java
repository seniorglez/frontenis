/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.GameController;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author diego
 */
public class GameFrame extends JFrame {

    static GameController gc;
    private Toolkit myMonitor = Toolkit.getDefaultToolkit();
    private Dimension monitorSize = myMonitor.getScreenSize();
    //intentar mover al controlador 
    private int x = 0;
    private int y = 0;
    private int xa = 0;
    private int ya = 0;

    public GameFrame() {
        
        this.setVisible(true);
        this.setLocation(new Point((int) monitorSize.getWidth() / 2 - 150, (int) monitorSize.getHeight() / 2 - 150));//coloca el frame centrado en la pantalla
        this.setSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Frontenis");
        this.setContentPane(new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);//limpia la pantalla
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//suaviza los bordes
                g2d.fillOval(x, y, 30, 30);
            }
        });
        
        this.gc=new GameController(this);//controller
    }

    public static void main(String[] args) throws InterruptedException {
        GameFrame gf= new GameFrame();
        while (true) {
            gc.moveBall();//update
            gf.repaint();//render, this method causes a call to this component's paint method as soon as possible.

            Thread.sleep(10);

        }
    }



    public Toolkit getMyMonitor() {
        return myMonitor;
    }

    public void setMyMonitor(Toolkit myMonitor) {
        this.myMonitor = myMonitor;
    }

    public Dimension getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(Dimension monitorSize) {
        this.monitorSize = monitorSize;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXa() {
        return xa;
    }

    public void setXa(int xa) {
        this.xa = xa;
    }

    public int getYa() {
        return ya;
    }

    public void setYa(int ya) {
        this.ya = ya;
    }

}
