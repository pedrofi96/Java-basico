/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade03;

import javax.swing.JOptionPane;

/**
 *
 * @author piedr
 */
public class Atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i, f;
        
        i= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero."));
        f =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro numero."));
        
        if(i > f){
            do{
                int j = f %2; 
                if(j != 0){
                    System.out.println(""+f);
                }
                f++;
            }
            while(i>f);
        }else if(f > i){
            do{
                int j = i %2; 
                if(j != 0){
                    System.out.println(""+f);
                }
                i++;
            }
            while(f>i);
        }else{
            int j=i%2;
            
            System.out.println(""+j);
            
        }
        
    }
    
}
