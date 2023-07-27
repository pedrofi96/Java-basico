package atividade01;

import javax.swing.JOptionPane;

public class Atividade01 {

    
    public static void main(String[] args) {
        int i;
        
        i = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero que você gostaria de fatorar: "));
        
        for (int f=1; f< i; f++){
            i = i*f;
            System.out.println(""+i);
        }   
        
        
        
        
        
    } 
}
