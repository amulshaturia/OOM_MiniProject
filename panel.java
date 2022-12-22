package Myproject;

import Myproject.*;

import javax.swing.* ; 
import java.awt.* ; 
import java.awt.Graphics2D ;
import  java.awt.geom.Arc2D ; 

public class panel extends JPanel{
     
    double x = 450 ; 
    static double y = 580 - Frame.height ; 
 
    public void paint(Graphics g) {
        super.paint(g);
        if(Frame.var == true){
                        
            // Creating the Ball 
            Graphics2D g2d = (Graphics2D) g;
            Arc2D.Double circle = new Arc2D.Double(x, y, 20, 20, 0, 360, Arc2D.CHORD);
            g2d.fill(circle);
            setForeground(Color.red);
            // Ball created 
            
            // Bouncing Logic 
            if(Frame.var == true){
                Bounce.bounce();
            }
            // Bouncing Logic
            
            if(Bounce.JumpCount <= 10){
                try{
                    Thread.sleep(17);
                }catch(Exception ex){}
                repaint();
            }
            else{
                y = 0 ; 
                Bounce.JumpCount = 0 ;
                Bounce.speed = 0 ; 
                Frame.var = false ; 
            }
        }
    }
}