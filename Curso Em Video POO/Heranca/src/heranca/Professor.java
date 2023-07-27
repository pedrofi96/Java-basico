/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author piedr
 */
public class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;
    
    public void receberAumento(){
        this.setSalario(this.getSalario()* 1.10f);
        System.out.println(this.getNome()+" recebeu aumento, novo salario de: "+this.getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
