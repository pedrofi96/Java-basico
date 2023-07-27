/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca;

/**
 *
 * @author piedr
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Visitante v1 = new Visitante();
        v1.setIdade(22);
        v1.setNome("Pablito");
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        
        Aluno a1 = new Aluno();
        a1.setIdade(25);
        a1.setNome("Pedro");
        a1.setSexo("M");
        a1.setCurso("Fisica");
        a1.setMatricula(756);
        a1.pagarMensalidade();
        
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jefferson");
        b1.setIdade(20);
        b1.setSexo("M");
        b1.setMatricula(21209);
        b1.setCurso("Analise e Desenvolvimento de Sistemas. ");
        b1.setBolsa(315);
        b1.pagarMensalidade();
        
        
        Professor p1 = new Professor();
        p1.setNome("Arthur");
        p1.setIdade(45);
        p1.setEspecialidade("Fisico");
        p1.setSexo("M");
        p1.setSalario(9450);
        p1.receberAumento();
        
        
        
    }
    
}
