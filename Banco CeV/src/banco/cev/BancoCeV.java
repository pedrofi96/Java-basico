/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco.cev;

/**
 *
 * @author piedr
 */
public class BancoCeV {

  
    public static void main(String[] args) {
      
        ContaBanco p1 = new ContaBanco();
        p1.setnumeroConta(1);
        p1.setDono("Seu Creysson");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setnumeroConta(2);
        p2.setDono("Armandinho");
        p2.abrirConta("CP");
        p2.depositar(-300);
        p2.estadoAtual();
    }
    
}
