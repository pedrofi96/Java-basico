/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade04;

/**
 *
 * @author piedr
 */
public class Caneta {
    public String modelo;
    public String cor;
    private Float ponta;
    private int carga;
    private boolean tampada;

    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPOnta(float p){
        this.ponta = p;
    }

}
