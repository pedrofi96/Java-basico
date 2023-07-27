
package catalogo;


public class Virus {
    private String nome;
    private int gravidade;
    private int descoberta;
    private double mortalidade;
    private boolean vacina;
    
    
    public void definirGravidade(){
        
        if(this.getMortalidade()>= 0.5f && this.isVacina()==false){
            this.setGravidade(5);
        }else if(this.getMortalidade()<0.5f && this.isVacina()==false){
            this.setGravidade(4);
        }else if(this.getMortalidade()>= 0.5f && this.isVacina()){
            this.setGravidade(3);
        }else if (this.getMortalidade()>0.2f && this.getMortalidade()<=0.4 &&this.isVacina()){
            this.setGravidade(2);
        }else{
            this.setGravidade(1);
        }
   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGravidade() {
        return gravidade;
    }

    public void setGravidade(int gravidade) {
        this.gravidade = gravidade;
    }

    public int getDescoberta() {
        return descoberta;
    }

    public void setDescoberta(int descoberta) {
        this.descoberta = descoberta;
    }

    public double getMortalidade() {
        return mortalidade;
    }

    public void setMortalidade(double mortalidade) {
        this.mortalidade = mortalidade;
    }

    public boolean isVacina() {
        return vacina;
    }

    public void setVacina(boolean vacina) {
        this.vacina = vacina;
    }
    
    
    
    
}
