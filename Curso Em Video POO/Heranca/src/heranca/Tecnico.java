/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author piedr
 */
public class Tecnico extends Aluno {
    private String registroProfissional;
    
    public void praticar(){
        System.out.println(this.getNome()+" já praticou hoje.");
    }
}
