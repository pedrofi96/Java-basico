/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catsurfing;

/**
 *
 * @author piedr
 */
public class CatSurfing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*  private String nome;
    private int idade;
    private String cor;
    private String sexo;
    private boolean castrado;
    private boolean vermifugado;
    private boolean vacinado;
    private boolean saudavel;
        */
        
        Gato g1 = new Gato();
        g1.setNome("Bixano");
        g1.setSexo("M");
        g1.setCor("Marrom");
        g1.setIdade(2);
        g1.setCastrado(false);
        g1.setVacinado(false);
        g1.setCastrado(true);
        g1.disponibilidade();
        g1.setAdotado(false);
        g1.disponibilidade();
        
    }
    
}
