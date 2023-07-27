package atvcondominio;


public class CustoCondominio {
    private double contaEnergia;
    private double contaAgua;
    private double salarioLimpeza;
    private boolean mesPintura;
    private boolean mesServico;
    private double precoPintura;
    private double precoServico;
    private double valorTotalMensal;
    private int diaMes;

    public void diaDesconto(){
        if(this.getDiaMes()<6){
            this.setContaAgua(this.getContaAgua()*0.9f);
        }
    }
    
    public void valorTotalMensalPagar(){
        if(this.isMesPintura() && this.isMesServico()){  
            this.setValorTotalMensal(this.getContaAgua()+ this.getContaEnergia()+ this.getSalarioLimpeza()+this.getPrecoPintura()+this.getPrecoServico());
        }else if(this.isMesPintura()){
            this.setValorTotalMensal(this.getContaAgua()+ this.getContaEnergia()+ this.getSalarioLimpeza()+this.getPrecoPintura());  
        }else if(this.isMesServico()){
            this.setValorTotalMensal(this.getContaAgua()+ this.getContaEnergia()+ this.getSalarioLimpeza()+this.getPrecoServico());
        }else{
            this.setValorTotalMensal(this.getContaAgua()+ this.getContaEnergia()+ this.getSalarioLimpeza());
        }
    }

    public double getPrecoPintura() {
        return precoPintura;
    }

    public void setPrecoPintura(double precoPintura) {
        this.precoPintura = precoPintura;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }
    
    
    
    
    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }
    
    public double getContaEnergia() {
        return contaEnergia;
    }

    public void setContaEnergia(double contaEnergia) {
        this.contaEnergia = contaEnergia;
    }

    public double getContaAgua() {
        return contaAgua;
    }

    public void setContaAgua(double contaAgua) {
        this.contaAgua = contaAgua;
    }

    public double getSalarioLimpeza() {
        return salarioLimpeza;
    }

    public void setSalarioLimpeza(double salarioLimpeza) {
        this.salarioLimpeza = salarioLimpeza;
    }

    public boolean isMesPintura() {
        return mesPintura;
    }

    public void setMesPintura(boolean mesPintura) {
        this.mesPintura = mesPintura;
    }

    public boolean isMesServico() {
        return mesServico;
    }

    public void setMesServico(boolean mesServico) {
        this.mesServico = mesServico;
    }

    public double getValorTotalMensal() {
        return valorTotalMensal;
    }

    private void setValorTotalMensal(double valorTotalMensal) {
        this.valorTotalMensal = valorTotalMensal;
    }
    
}