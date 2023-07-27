/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;



public class Conta {
    private String nomeCliente; 
    private Float saldo=0f ;
    private Float limite;
    
    
    public void mudarNome(String nomeNovo){
         this.nomeCliente= nomeNovo ;
    }
    
    public void mudarSaldo(Float entradaSaldo){
        this.saldo= saldo + entradaSaldo;    
    }
    public void adicionarLimite(Float novoLimite){
        this.limite = novoLimite;
    }
    public boolean limiteCheck(){
       
        if(this.saldo>=this.limite){
            saldo=limite;
            
            return true;
        } 
        return false;
    }
    public String retornarNome(){
        return this.nomeCliente;
    }
   public float retornarSaldo(){
       return this.saldo;
   }
   public float retornarLimite(){
       return this.limite;
   }
}
