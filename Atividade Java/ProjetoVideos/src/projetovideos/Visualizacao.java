/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovideos;


public class Visualizacao {
    private Garfanhoto espectador;
    private Video filme;

    public Visualizacao(Garfanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+ 1);
        this.filme.setViews(this.filme.getViews()+1);
        
    }
    public void avaliar(){
        this.filme.setAvaliacao(6);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if(tot <= 20){
            tot = 1;
        }else if(tot <=50){
            tot = 4;
        }else if(tot <=80){
            tot = 7;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(this.filme.getAvaliacao()+ tot);
    }
    public Garfanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Garfanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
