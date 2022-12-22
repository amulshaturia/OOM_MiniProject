package Myproject;

import javax.swing.* ; 
import java.awt.* ; 
import java.awt.Graphics2D ;
import  java.awt.geom.Arc2D ;

public class Output {

    public static void output(){
        if(Bounce.JumpCount == 1){
            Frame.L1.setText("1st Bounce " + Bounce.JumpHeight);
        }
        if(Bounce.JumpCount == 2){
            Frame.L2.setText("2nd Bounce " + Bounce.JumpHeight);
        }
        if(Bounce.JumpCount == 3){
            Frame.L3.setText("3rd Bounce " + Bounce.JumpHeight);
        }
        if(Bounce.JumpCount == 4){
            Frame.L4.setText("4th Bounce " + Bounce.JumpHeight);
        }
        if(Bounce.JumpCount == 5){
            Frame.L5.setText("5th Bounce " + Bounce.JumpHeight);
        }
        if(Bounce.JumpCount == 6){
            Frame.L6.setText("6th Bounce " + Bounce.JumpHeight);
        }
        if(Bounce.JumpCount == 7){
            Frame.L7.setText("7th Bounce " + Bounce.JumpHeight);
        }
        if(Bounce.JumpCount == 8){
            Frame.L8.setText("8th Bounce " + Bounce.JumpHeight);
        }
        if(Bounce.JumpCount == 9){
            Frame.L9.setText("9th Bounce " + Bounce.JumpHeight);
        }
        if(Bounce.JumpCount == 10){
            Frame.Ll0.setText("10th Bounce " + Bounce.JumpHeight);
        }
    }

}
