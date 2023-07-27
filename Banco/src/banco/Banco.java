/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import javax.swing.JOptionPane;


public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.mudarNome(JOptionPane.showInputDialog("Digite o nome do novo cliente."));
        conta.mudarSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo do novo cliente")));
        conta.adicionarLimite(Float.parseFloat(JOptionPane.showInputDialog("Digite o limite da conta.")));
        conta.limiteCheck();
        if(conta.limiteCheck()==true){
            JOptionPane.showMessageDialog(null, "O saldo da conta atingiu o seu  limite.");
        }
        String nome = conta.retornarNome();
        float saldo2 = conta.retornarSaldo();
        float limite2 = conta.retornarLimite();
        JOptionPane.showMessageDialog(null, "O nome do cliente: "+nome+
        "\nPossui saldo de: "+saldo2+
                "\nE limite de: "+limite2);
        
      
        
    }
    
}
