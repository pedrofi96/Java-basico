/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carros;

import javax.swing.JOptionPane;

public class Carros {

    public static void main(String[] args) {
        /*Carro c1 = new Carro();
        c1.cor= "Azul";
        c1.modelo="Honda Fit";
        c1.ligado=false;
        c1.velocidadeMaxima= 210;
        c1.velocidadeAtual= 40;
        c1.aceleracao =10;
        c1.ligar();
        c1.acelerar();
        c1.ligadoDesligado();
        c1.status();
        */
        Carro c2 = new Carro();
        c2.cor = JOptionPane.showInputDialog("Digite a cor do carro:");
        c2.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
        int resposta = JOptionPane.showConfirmDialog(null, "O carro está ligado?");
        if(resposta ==0){
            c2.ligado = true;
        }else{
            c2.ligado= false;
        }
        c2.velocidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade máxima do carro:"));
        c2.velocidadeAtual = Integer.parseInt(JOptionPane.showInputDialog("DIgite a velocidade atual do carro:"));
        JOptionPane.showConfirmDialog(null, "O carro está acelerando?");
        if(resposta==0){
            c2.aceleracao = Integer.parseInt(JOptionPane.showInputDialog("Quanto o carro está acelerando?"));
        }
        c2.acelerar();
        c2.velocidadeCheck();
        c2.mudarMarcha();
        c2.ligadoDesligado();
        JOptionPane.showMessageDialog(null, "O carro do modelo: "+c2.modelo+
                "\nDa cor: "+c2.cor+
                "\nEstá: "+c2.statusCarro+
                "\nNa velocidade: "+c2.velocidadeAtual+"km"+
                "\nPortanto na marcha: "+c2.marchaCarro+
                "\nPodendo chegar a velocidade máxima de: "+c2.velocidadeMaxima+"Km");
    }   
}
 