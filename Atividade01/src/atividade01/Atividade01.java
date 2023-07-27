/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade01;

import javax.swing.JOptionPane;
/**
 *
 * @author piedr
 */
public class Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Medicamento remedio1 = new Medicamento();
        remedio1.nome = JOptionPane.showInputDialog("Qual o nome do remédio? ");
        remedio1.miligramas =Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade em miligramas:"));
        remedio1.capsulas= Integer.parseInt(JOptionPane.showInputDialog("Quantas capsulas vc quer? "));
        remedio1.valor= Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do remedio:"));
        JOptionPane.showMessageDialog(null, "O remedio: "+remedio1.nome+
                "\nde "+remedio1.miligramas+" miligramas"+
                "\ncom "+remedio1.capsulas+"capsulas"+
                "\ntem o valor de: R$"+remedio1.valor);
    }
    
}
