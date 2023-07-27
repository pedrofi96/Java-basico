package catalogo;


public class Catalogo {

   
    public static void main(String[] args) {
        
        Virus v1 = new Virus();
        v1.setDescoberta(1005);
        v1.setMortalidade(0.5);
        v1.setNome("Viroso");
        v1.setVacina(false);
        v1.definirGravidade();
        
        System.out.println("Gravidade: "+ v1.getGravidade());
        
        
        
        
    }
    
}
