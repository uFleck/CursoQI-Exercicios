package Model;


public class Vendedor {
    private String nome;
    private double vendasJaneiro;
    private double vendasFevereiro;
    private double vendasMarco;
    
    public Vendedor(String nome, double vendasJaneiro, double vendasFevereiro, double vendasMarco){
        this.nome = nome;
        this.vendasJaneiro = vendasJaneiro;
        this.vendasFevereiro = vendasFevereiro;
        this.vendasMarco = vendasMarco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVendasJaneiro() {
        return vendasJaneiro;
    }

    public void setVendasJaneiro(double vendasJaneiro) {
        this.vendasJaneiro = vendasJaneiro;
    }

    public double getVendasFevereiro() {
        return vendasFevereiro;
    }

    public void setVendasFevereiro(double vendasFevereiro) {
        this.vendasFevereiro = vendasFevereiro;
    }

    public double getVendasMarco() {
        return vendasMarco;
    }

    public void setVendasMarco(double vendasMarco) {
        this.vendasMarco = vendasMarco;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + nome + "\nVendas de Janeiro: " + vendasJaneiro + "\nVendas de Fevereiro: " + vendasFevereiro + "\nVendas de Marco: " + vendasMarco;
    }
    
    public double calcularMediaVendas(){
        return (this.vendasJaneiro + this.vendasFevereiro + this.vendasMarco) / 3;
    }
    
    public String verCategoria(){
        String categoria;
        double mv = calcularMediaVendas();
        if(mv <= 1000){
            categoria = "Péssimo Vendedor";
        } else if(mv < 2500){
            categoria = "Vendedor Desmotivado";
        } else if(mv < 5000){
            categoria = "Vendedor Bom";
        } else if(mv < 10000){
            categoria = "Ótimo Vendedor";
        } else{
            categoria = "Excelente Vendedor - Receber prêmio";
        }
        return categoria;
    }
}
