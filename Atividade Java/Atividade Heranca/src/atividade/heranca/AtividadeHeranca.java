/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.heranca;

public class AtividadeHeranca {

    public static void main(String[] args) {
        Medico m1 = new Medico();
        m1.setIdade(70);
        m1.setCRM("09813489");
        m1.setNome("Seu Creysson");
        m1.setSalario(15000);
        m1.medicoAposentado();
        m1.valorAposentado();
        
        Medico m2 = new MedicoAuxiliar();
        m2.setNome("Jegue");
        m2.setIdade(70);
        m2.setCRM("908231321");
        m2.setSalario(2800);
        m2.medicoAposentado();
        m2.valorAposentado();
               
        Medico m3 = new MedicoCirurgiao();
        m3.setNome("Boto Cor de Rosa");
        m3.setCRM("8908902343");
        m3.setSalario(32000);
        m3.setIdade(51);
        m3.medicoAposentado();
        m3.valorAposentado();
        
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        
        
//        System.out.println("Medico 1:\nNome: "+ m1.getNome() +"\nCRM: "+ m1.getCRM()+"\nIdade: "+ m1.getIdade() +"\nSalario: "+m1.getSalario()+ "\nAposentado: "+m1.medicoAposentado()+
//                "\nMedico 2: \nNome: "+ m2.getNome() +"\nCRM: "+ m2.getCRM()+"\nIdade: "+ m2.getIdade() +"\nSalario: "+m2.getSalario()+"\n Aposentado: "+m2.medicoAposentado()+
//                "\nMedico 3:\nNome: "+ m3.getNome() +"\nCRM: "+ m3.getCRM()+"\nIdade: "+ m3.getIdade() +"\nSalario: "+m3.getSalario()+"\n Aposentado: "+m3.medicoAposentado());
//        
        
    }
    
}
