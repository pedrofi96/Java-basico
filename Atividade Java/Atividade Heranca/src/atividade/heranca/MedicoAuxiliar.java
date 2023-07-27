/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.heranca;

/**
 *
 * @author piedr
 */
public class MedicoAuxiliar extends Medico {
    
  
    @Override
    public boolean medicoAposentado(){
        
        if(this.getIdade()>60){
            return true;
        }
        return false;
    }

    
}
