package Model;


public class Funcionario {
    private double salarioFixo;
    private double valorVendas;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    @Override
    public String toString() {
        return "Salário fixo: " + salarioFixo + "\nValor das vendas: " + valorVendas;
    }
    
    public double calcularComissao(){
        return (valorVendas * 0.04);
    }
    
    public double calcularSalarioFinal(){
        return salarioFixo + calcularComissao();
    } 
}
