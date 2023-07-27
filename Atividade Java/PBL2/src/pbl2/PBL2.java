package pbl2;

import java.util.ArrayList;


public class PBL2 {

    
    public static void main(String[] args) {
       
     Armario a1 = new Armario();
     a1.setNome("Alvorada");
     a1.setCoordenadaX(346842);
     a1.setCoordenadaY(378674);
     a1.setTrancado(true);
     a1.setOcupado(false);
    
     Armario a2 = new Armario();
     a2.setNome("Alvorada");
     a2.setCoordenadaX(346842);
     a2.setCoordenadaY(378674);
     a2.setTrancado(true);
     a2.setOcupado(false);
     
     ArrayList<Armario> ArmarioAlvorada = new ArrayList<>();
     ArmarioAlvorada.add(a1);
     ArmarioAlvorada.add(a2);
     
     
     Usuario u1 = new Usuario();
     u1.setNome("Pedro");
     u1.setSenha(12345);
     u1.setArmario(ArmarioAlvorada.indexOf(a1)+1);
     
     a1.setTrancado(false);
     a1.setOcupado(true);
      
     System.out.println(a1.toString());
     System.out.println(u1.toString());
     System.out.println(a2.toString());
     System.out.println("O armario");
    
     
     
     
        
    } 
}
