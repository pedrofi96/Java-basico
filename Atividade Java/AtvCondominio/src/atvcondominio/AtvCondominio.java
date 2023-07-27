package atvcondominio;


public class AtvCondominio {

    
    public static void main(String[] args) {
        
        CustoCondominio janeiro = new CustoCondominio();
        janeiro.setDiaMes(3);
        janeiro.setContaAgua(50);
        janeiro.setContaEnergia(120);
        janeiro.setMesPintura(true);
        janeiro.setMesServico(false);
        janeiro.setPrecoPintura(50);
        janeiro.setPrecoServico(50);
        janeiro.setSalarioLimpeza(1000);
        janeiro.valorTotalMensalPagar();
        
        
        System.out.println("Valor total a pagar: "+ janeiro.getValorTotalMensal());
        
        
        
        
        
        
        
        
    }
    
}
