
package atividade02poo;


public class Atividade02POO {

   
    public static void main(String[] args) {
        
        Celular c1 = new Celular();
        c1.setModelo("PêraPhone2");
        c1.setMarca("PêraPhone");
        c1.setSerie("F13i29478t78935");
        c1.setValor(560.0);
        c1.setCarregador(true);
        c1.setFone(true);
        
        c1.status();
    }
    
}
