/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetovideos;

/**
 *
 * @author piedr
 */
public class ProjetoVideos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Video v[] = new Video[3];
    v[0]= new Video("Aula 1 POO");
    v[1]= new Video("Estudando POO");
    v[2] = new Video("Finalmente aprendendo a criar vetores em Java");
    
    System.out.println(v[0].toString());
    System.out.println(v[2].toString());
    
    Garfanhoto g[] = new Garfanhoto[2];
    g[0] = new Garfanhoto("SeuCreysson", 24, "M", "SeuCreyssonReborn");
    g[1] = new Garfanhoto("Pedrofi", 26, "M", "Black_Rose");
    
    System.out.println(g[0].toString());
    
    Visualizacao vis[] = new Visualizacao[5];
    vis[0] = new Visualizacao(g[0], v[2]);
    vis[0].avaliar(85.0f);
    System.out.println(vis[0].toString());
    
    
    }
    
}
