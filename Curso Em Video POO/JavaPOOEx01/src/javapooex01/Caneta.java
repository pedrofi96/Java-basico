/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapooex01;

/**
 *
 * @author piedr
 */
public class Caneta {
    String modelo;
    String cor;
    Float ponta;
    private int carga=100;
    private boolean tampada;
    
    void status(){
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Uma caneta"+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga:" +this.carga);
        System.out.println("Está tampada?"+this.tampada);
    }
    public void rabiscar(){
        if(this.tampada== true){
            System.out.println("Infelimznte não é possivel rabiscar");
        }else{
            System.out.println("Pode rabiscar.");
        }
    }
    
    public void tampar(){
        this.tampada= true;
    }
    
    public void destampar(){
        this.tampada=false;
    }
   /* 
    public Caneta(){ //metodo construtor: ao criar caneta já adiciona o valor de tampada e cor. ele precisa ter mesmo nome da classe.
        this.tampar();
        this.cor = "azul";
        
    }
    
    public boolean getTampada(){ //meto getter para conseguir saber se está tampada msm sendo privado.
        return this.tampada;
    }
    public String getCor(){ //meto getter para conseguir saber a cor msm sendo privado.
        return this.cor;
    }
    
    public String getModelo(){ //meto getter para conseguir saber o modelo msm sendo privado.
        return this.modelo;
    }
     public float getPonta(){ //meto getter para conseguir saber a ponta msm sendo privado.
        return this.ponta;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: "+ this.getCor());
        System.out.println("Tampada: " +this.getTampada());
        
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    */ 
    
}
