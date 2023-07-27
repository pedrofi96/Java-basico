package atividade02;

import javax.swing.JOptionPane;

public class Atividade02 {

    public static void main(String[] args) {
        float i, f;
        
        i= Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um numero."));
        f =Float.parseFloat(JOptionPane.showInputDialog(null, "Digite outro numero."));
        
        if(i > f){
            JOptionPane.showConfirmDialog(null, "O numero "+i+" é maior que "+f);
        }else if(f > i){
            JOptionPane.showConfirmDialog(null, "O numero "+f+" é maior que "+i);
        }else{
            JOptionPane.showConfirmDialog(null, "Os numeros tem o mesmo valor");
        }
    }
}
