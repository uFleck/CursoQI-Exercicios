package Model;


public class Vendedor {
    public double salarioFixo;
    public double totalVendas;
    public double percentualComissao;

    @Override
    public String toString() {
        return "\nSalárioFixo: " + salarioFixo + "\nTotalVendas: " + totalVendas + "\nPercentualComissao: " + percentualComissao;
    }
    
    public double transformarPercentual(){
        return this.percentualComissao / 100;
    }
    
    public double calcularComissao(){
        return this.totalVendas * this.transformarPercentual();
    }
    
    public double calcularTotal(){
        return this.salarioFixo + this.calcularComissao();
    }
}
