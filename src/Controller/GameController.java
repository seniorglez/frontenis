/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.GameFrame;

/**
 *
 * @author Diego
 */
public class GameController {
    private GameFrame gf;
    public GameController(GameFrame gf){
        this.gf=gf;
    }
    public void moveBall(){
        //condiciones para cambiar la dirección
        if (gf.getX() + gf.getXa() < 0) gf.setXa(1);
	if (gf.getX()+ gf.getXa() >gf.getContentPane().getWidth()- 30)gf.setXa(-1);
	if (gf.getY() + gf.getYa() < 0) gf.setYa(1);
	if (gf.getY()+ gf.getYa() > gf.getContentPane().getHeight() - 30)gf.setYa(-1);
	//movimiento	
		gf.setX(gf.getX()+gf.getXa());
		gf.setY(gf.getY()+gf.getYa());
                System.out.println("("+gf.getX()+","+gf.getY()+")");
    }
    
   
}
