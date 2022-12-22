package Myproject;

import javax.annotation.processing.SupportedOptions;
import javax.swing.* ; 
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*; 

class Frame extends JFrame implements ChangeListener, ActionListener {

    static boolean var = false ; 
    static double height = 680 , E = 1 ;
    static JLabel ELabel , HeightLabel ;
    static JSlider ESlider , HeightSlider ;
    static JLabel L1 , L2 , L3 ,L4, L5 ,L6 ,L7 ,L8 , L9 , Ll0 ;  
    JButton button ;

    panel pnl ; 

    Frame(){
        setVisible(true);
        setLayout(null);
        setSize(1000 , 820);
        setLocationRelativeTo(null); 
        setTitle("Coefficient Of Resititution Simulator");
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        // creating space for Graphic programing by a panel
        pnl = new panel();
        pnl.setBounds(0 , 70, 1000 , 600);
        pnl.setBackground(Color.green);
        add(pnl);

        /*********************Sliders*****************************/ 

            // ESlider
        ESlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 1);
        ESlider.setBounds(0, 0, 250, 40);
            // Label for the value of ESlider
        ELabel = new JLabel();
        add(ELabel);
        ELabel.setBounds(0, 30, 250, 40);
        ESlider.setMinorTickSpacing(1);  
        ESlider.setMajorTickSpacing(10);
        ELabel.setFont(new Font("calibri" , Font.BOLD , 18));
        ELabel.setText("  Value of e : " + (double)ESlider.getValue()/100);
        add(ESlider);
            //HeightSlider
        HeightSlider = new JSlider(JSlider.HORIZONTAL, 0, 1000, 10);
        HeightSlider.setBounds(400, 0, 250, 40);
            // Label for the value of HeightSlider
        HeightLabel= new JLabel();
        add(HeightLabel);
        HeightLabel.setFont(new Font("calibri" , Font.BOLD , 18));
        HeightLabel.setText("  Value of Height : " + (double)HeightSlider.getValue()/100);
        HeightLabel.setBounds(400, 30, 250, 40);
        HeightSlider.setMinorTickSpacing(1);  
        HeightSlider.setMajorTickSpacing(10);
 
        //Creating a new class for ChangeListener
        class Listener implements ChangeListener{
            public void stateChanged(ChangeEvent e){        
                HeightLabel.setText("  Value of Height : "+ (double)HeightSlider.getValue());
            }
        }
        
        ESlider.addChangeListener(this);
        HeightSlider.addChangeListener(new Listener());
        add(HeightSlider);
        
        //Submit Button code 
        button = new JButton("Start");
        add(button);
        button.setBounds(700, 15, 75 , 30);
        button.addActionListener(this) ; 

        /**************************Labels for Output*******************************/
        L1 = new JLabel();
        add(L1);
        L1.setBounds(5, 660, 200, 50);
        
        L2 = new JLabel();
        add(L2);
        L2.setBounds(5, 680, 200, 50);
        
        L3= new JLabel();
        add(L3);
        L3.setBounds(5, 700, 200, 50);
        
        L4 = new JLabel();
        add(L4);
        L4.setBounds(5, 720, 200, 50);

        L5 = new JLabel();
        add(L5);
        L5.setBounds(5 , 740 , 200 , 50);

        L6 = new JLabel();
        add(L6);
        L6.setBounds(300, 660, 200, 50);

        L7 = new JLabel();
        add(L7);
        L7.setBounds(300, 680, 200, 50);
        
        L8 = new JLabel();
        add(L8);
        L8.setBounds(300, 700, 200, 50);
        
        L9 = new JLabel();
        add(L9);
        L9.setBounds(300, 720, 200, 50);
        
        Ll0 = new JLabel();
        add(Ll0);
        Ll0.setBounds(300, 740, 200, 50);
    }

    public void stateChanged(ChangeEvent e){        
        ELabel.setText("  Value of e : "+ (double)ESlider.getValue()/100);
    }
    
    public void actionPerformed(ActionEvent e){ 
        E = (double)ESlider.getValue()/100 ; 
        panel.y = 580 - (double)HeightSlider.getValue() ; 
        Bounce.JumpHeight = (double)HeightSlider.getValue();
        var = true; 
        Bounce.JumpCount = 0 ; 
        repaint();
    }   
}

public class Myclass {    
    public static void main(String args[]){
        Frame frame = new Frame(); 
    }
}