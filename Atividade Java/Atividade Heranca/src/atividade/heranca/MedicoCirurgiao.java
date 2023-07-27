/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.heranca;

/**
 *
 * @author piedr
 */
public class MedicoCirurgiao extends Medico {
    
    
    
@Override
public boolean medicoAposentado(){
        if(this.getIdade()>50){
            return true;
        }
        return false;
    }

@Override
     public void valorAposentado(){
         
        if(this.medicoAposentado()){
            this.setAposentadoria((this.getSalario()* 0.8) + 800);
        }
    }




}
