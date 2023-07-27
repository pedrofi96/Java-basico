/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carros;

/**
 *
 * @author piedr
 */
public class Carro {
    String cor;
    String modelo;
    int velocidadeAtual;
    int velocidadeMaxima;
    int aceleracao;
    boolean ligado;
    String statusCarro;
    int marchaCarro;
    
    void ligar(){
      this.ligado=true;
    }
    void desligar(){
        this.ligado=false;
        this.velocidadeAtual= 0;
    }
    void acelerar(){
        
        this.velocidadeAtual = this.velocidadeAtual + this.aceleracao;
                
    }
    void mudarMarcha(){
        if( this.velocidadeAtual<=20){
            this.marchaCarro = 1;
        }else if (this.velocidadeAtual> 20 && this.velocidadeAtual<=40 ){
            this.marchaCarro=2;
        }else if(this.velocidadeAtual> 40 && this.velocidadeAtual<=60){
            this.marchaCarro=3;
        }else if(this.velocidadeAtual> 60 && this.velocidadeAtual<=100){
            this.marchaCarro=4;
        }else{
            this.marchaCarro=5;
        }
    }
    
    void ligadoDesligado(){
        if (this.ligado==true){
            this.statusCarro = "ligado";
        }else{
            this.statusCarro= "desligado";
        }
    }
    void velocidadeCheck(){
        if (this.velocidadeAtual > this.velocidadeMaxima){
            this.velocidadeAtual=this.velocidadeMaxima;
        }
    }
    void status(){
        System.out.println("O carro é da cor: "+ this.cor);
        System.out.println("O carro é do modelo: "+ this.modelo);
        System.out.println("A velocidade máxima do carro é: "+this.velocidadeMaxima);
        System.out.println("O carro está: "+this.statusCarro);
        System.out.println("A velocidade atual do carro é de: "+this.velocidadeAtual);
        System.out.println("O carro está na amrcha: "+marchaCarro);
    }   
}
