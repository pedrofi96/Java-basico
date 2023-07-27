/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.heranca;

/**
 *
 * @author piedr
 */
public class Medico {
    
    private String CRM;
    private String nome;
    private int idade;
    private double salario;
    private double aposentadoria;
    

    public boolean medicoAposentado(){
        if(this.getIdade()>=55){
            return true;
        }
        return false;
    }
    
    
    public void valorAposentado(){    
        if(this.medicoAposentado()){
            this.setAposentadoria(this.getSalario()*0.8);
        }
    }

    public double getAposentadoria() {
        return aposentadoria;
    }

    public void setAposentadoria(double aposentadoria) {
        this.aposentadoria = aposentadoria;
    }
    
    
    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Medico{" + "CRM=" + CRM + ", nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", aposentadoria=" + aposentadoria + '}';
    }
    
}
