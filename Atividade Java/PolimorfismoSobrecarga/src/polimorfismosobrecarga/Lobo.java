/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismosobrecarga;

/**
 *
 * @author piedr
 */
public class Lobo extends Cachorro {
    
    //testando polimorfismo com sobrecarga com metodos com mesmo nome mas assinaturas diferentes
    public void reagir(boolean cautela, boolean distante){
        if(cautela && distante){
            System.out.println("Reagiu bem!");
        }else if(!cautela && distante){
            System.out.println("Reaja com cautela");
        }else if(cautela && !distante){
            System.out.println("Cuidado com a distância, se afaste um pouco");
        }else{
            System.out.println("Lobo atacou!");
        }
    }
    
    public void reagir(boolean rapido){
        if(rapido){
            System.out.println("Lobo surpreso, atacou com medo!");
        }else{
            System.out.println("Tenha cautela ao se aproximar de um lobo.");
        }
           
    }

    @Override
    public void emitirSom() {
        System.out.println("uivo de lobo");
    }
    
    
    
}
