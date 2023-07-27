/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade04;

import javax.swing.JOptionPane;

/**
 *
 * @author piedr
 */
public class Atividade04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;    
         
        i = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero. "));    
        
        
        if(ehPrimo(i)){
            JOptionPane.showInternalConfirmDialog(null, i+"É primo.");
            System.out.println("É primo");
        }else{
            JOptionPane.showInternalConfirmDialog(null, i+"Não é primo.");
            System.out.println("Não é primo");
        }
        
    }
     
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) 
                return false;   
        }
        return true;
       
    }
    
   
    
}
