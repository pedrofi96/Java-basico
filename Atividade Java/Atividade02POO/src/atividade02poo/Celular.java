/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02poo;

/**
 *
 * @author piedr
 */
public class Celular {
    protected String Marca;
    protected String Modelo;
    protected String Serie;
    protected double valor;
    protected boolean carregador;
    protected boolean fone;
    
    public void status(){
        System.out.println("Celular da marca: "+this.getMarca()+ "\n modelo: "+ this.getModelo()+ "\n Serie: "+ this.getSerie()+ "\n com valor de: "+ this.getValor() + 
                "\n vem com Carregador: "+ this.isCarregador()+ "\n Ven com fone: "+ this.isFone());
    }
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isCarregador() {
        return carregador;
    }

    public void setCarregador(boolean carregador) {
        this.carregador = carregador;
    }

    public boolean isFone() {
        return fone;
    }

    public void setFone(boolean fone) {
        this.fone = fone;
    }
    
    
    
    
}
