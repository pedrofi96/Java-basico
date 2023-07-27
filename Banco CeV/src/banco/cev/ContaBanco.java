/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.cev;

/**
 *
 * @author piedr
 */
public class ContaBanco {
    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean statusConta;
    
    public void estadoAtual(){
        System.out.println("Conta: "+this.getNumeroConta());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Status: "+this.getStatusConta());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatusConta(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)){
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo()> 0) {
            System.out.println("Conta não pode ser fechada pois ai tem tem saldo \n Saldo de: "+this.getSaldo());
        } else if(this.getSaldo()< 0){
            System.out.println("Conta não pode ser fechada pois tem saldo negativo; \n Divida de: "+this.getSaldo());
        }else {
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso.");
        }    
    }
    
    public void depositar(float v){
        if (this.statusConta == true){
            this.setSaldo(this.getSaldo()+ v);
            System.out.println("Depósito realizado com sucesso na conta de "+this.getDono()+"\nNovo saldo de: "+this.getSaldo());
        }else {
            System.out.println("Impossivel depositar numa conta fechada.");
        }
    }
    
    public void sacar(float v){
        if (this.getStatusConta()){
            if (this.getSaldo()>= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+this.getDono());
            }else {
                System.out.println("Saldo insuficiente para efetivar o saque.");
            }
        }else {
            System.out.println("Impossivel sacar de uma conta fechada.");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo()== "CC"){
            v=12;
        }else if (this.getTipo()=="CP"){
            v=20;
        }
        if (this.getStatusConta()){
            this.setSaldo(this.getSaldo()- v);
            System.out.println("Mensalidade paga com sucesso por "+this.getDono());
        }else{
            System.out.println("Impossivel pagar mensalidade, conta bloqueada");
            this.setStatusConta(false);
        }
    }

    public ContaBanco() { //metodo construtor, ele tem q ter mesmo nome da classe.
        this.saldo=0;
        this.statusConta=false;
    }
    
    public void setnumeroConta(int n){
        this.numeroConta = n;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public void setDono(String pessoa) {
        this.dono = pessoa;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(float S) {
        this.saldo = S;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public boolean getStatusConta() {
        return statusConta;
    }
}
