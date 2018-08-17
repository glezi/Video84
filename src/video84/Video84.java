/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video84;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gleez
 */
public class Video84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoCalculadora mimarco = new MarcoCalculadora(); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true); 
        
    }
    
}
class MarcoCalculadora extends JFrame{
    
    public MarcoCalculadora(){
        
    
    setTitle("Calculadora"); 
    setBounds(500,300,450,300); 
    LaminaCalculadora milaminas = new LaminaCalculadora(); 
    add(milaminas); 
    }
}

class LaminaCalculadora extends JPanel {
    public LaminaCalculadora(){
        setLayout(new BorderLayout()); 
        JButton pantalla = new JButton("0"); 
        pantalla.setEnabled(false); 
        add(pantalla,BorderLayout.NORTH); 
        
        JPanel milamina2 = new JPanel(); 
        milamina2.setLayout(new GridLayout(4,4));
        
        JButton boton = new JButton("1"); 
        milamina2.add(boton); 
        
         JButton boton2 = new JButton("2"); 
        milamina2.add(boton2); 
        
         JButton boton3 = new JButton("3"); 
        milamina2.add(boton3); 
        
          JButton boton4 = new JButton("4"); 
        milamina2.add(boton4); 
        
         JButton boton5 = new JButton("5"); 
        milamina2.add(boton5); 
        
         JButton boton6 = new JButton("6"); 
        milamina2.add(boton6); 
        
         JButton boton7 = new JButton("7"); 
        milamina2.add(boton7); 
        
          JButton boton8 = new JButton("8"); 
        milamina2.add(boton8); 
        
         JButton boton9 = new JButton("9"); 
        milamina2.add(boton9); 
        
         JButton boton10 = new JButton("="); 
        milamina2.add(boton10); 
        
         JButton boton11 = new JButton("*"); 
        milamina2.add(boton11); 
        
          JButton boton12 = new JButton("/"); 
        milamina2.add(boton12); 
        
            JButton boton13 = new JButton("."); 
        milamina2.add(boton13); 
        
         JButton boton14 = new JButton("."); 
        milamina2.add(boton14); 
        
          JButton boton15 = new JButton(" ."); 
        milamina2.add(boton15); 
        
         JButton boton16 = new JButton(" ."); 
        milamina2.add(boton16); 
        
        add(milamina2, BorderLayout.CENTER);
    }
}