/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapooex02;
import javax.swing.JOptionPane;

public class JavaPOOEX02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("Bic");
        /*Também da pra usar: c1.modelo = "BIC";*/
        c1.setPonta(0.5f);
        /*Mas não é possivel usar o: c1.ponta = 0.5f; /pois ponta é privado*/
        c1.status();
        //System.out.println("Tenho uma caneta de modelo: "+c1.getModelo()+"\nDe ponta: "+c1.getPonta());
        
    }
    
}
