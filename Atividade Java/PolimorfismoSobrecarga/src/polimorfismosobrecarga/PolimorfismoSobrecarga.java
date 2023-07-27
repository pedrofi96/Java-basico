package polimorfismosobrecarga;


public class PolimorfismoSobrecarga {

    
    public static void main(String[] args) {
        
        Lobo l1 = new Lobo();
        l1.reagir(true, true);
        l1.reagir(true);
        l1.emitirSom();
        
        
        Cachorro c1 = new Cachorro();
        c1.emitirSom();
    }
    
}
