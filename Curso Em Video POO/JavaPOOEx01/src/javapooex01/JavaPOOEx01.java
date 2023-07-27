/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapooex01;

/**
 *
 * @author piedr
 */
public class JavaPOOEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        /*
        c1.tampada = false;
        c1.carga = 100;
        */
         c1.status();
        c1.destampar();
        c1.rabiscar();
       
        
        Caneta c2 = new Caneta();
        c2.cor= "vermelha";
        c2.ponta= 0.9f;
        c2.modelo= "nike";
        c2.tampar();
        
        c2.status();
        c2.rabiscar();
        
   
        
    }
}
