package Myproject ; 

import javax.swing.* ; 
import java.awt.* ; 
import java.awt.Graphics2D ;
import  java.awt.geom.Arc2D ;

public class Bounce {

    static double speed = 0 ; 
    static int JumpCount = 0 ; 
    static int max_x = 600; 
    static int max_y = 600; 
    static double JumpHeight ; 
    static double gravity = 2.8 ; 

    public static void bounce(){
        double E = Frame.E ;
        if(panel.y + 20 >= max_y){
            double TempHeight = E*E*JumpHeight ; 
            JumpCount = JumpCount + 1 ; 
            System.out.println(JumpCount);
            speed = E*speed ; 
            speed = -speed ;  
            speed = speed + gravity ; 
            if(JumpHeight < 0.001){
                JumpHeight = 0 ; 
            }
            Output.output();
            JumpHeight = TempHeight ; 
        }
        else{
            speed = speed + gravity ;  
        }

        if(JumpCount < 10){
            panel.y = panel.y + speed ; 
            if(panel.y + 20 >= max_y){
                panel.y =  580 ; 
            }
        }
        else{
            panel.y = 580; 
        }
    }
}
