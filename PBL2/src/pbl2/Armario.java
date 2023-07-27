/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbl2;


public class Armario {
    private String nome;
    private double coordenadaX;
    private double coordenadaY;
    private int compartimentos;
    private int numeroCompartimento;
    private boolean trancado;
    private boolean ocupado;
    
    
    
    public void destrancar(){
         this.setTrancado(false);
    }
    
    public void trancar(){
        this.setTrancado(true);
    }
    
    public void ocupar(){
        this.setOcupado(true);
    }
    
    public void desocupar(){
        this.setOcupado(false);
    }
    

    public int getNumeroCompartimento() {
        return numeroCompartimento;
    }

    public void setNumeroCompartimento(int numeroCompartimento) {
        this.numeroCompartimento = numeroCompartimento;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(int compartimentos) {
        this.compartimentos = compartimentos;
    }

    
    public boolean isTrancado() {
        return trancado;
    }

    public void setTrancado(boolean trancado) {
        this.trancado = trancado;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Armario{" + "nome=" + nome + ", coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", trancado=" + trancado + ", ocupado=" + ocupado + '}';
    }

    String[] toString(int compartimentosG) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

  
    
    
    
    
}
