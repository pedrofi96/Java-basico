package pbl2;


public class Usuario {
    private String nome;
    private double senha;
    private int armario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSenha() {
        return senha;
    }

    public void setSenha(double senha) {
        this.senha = senha;
    }

    public int getArmario() {
        return armario;
    }

    public void setArmario(int armario) {
        this.armario = armario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", senha=" + senha + ", armario=" + armario + '}';
    }
    
    
    
    
}
