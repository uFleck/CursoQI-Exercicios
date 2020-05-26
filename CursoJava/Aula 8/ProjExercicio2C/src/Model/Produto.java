package Model;


public class Produto{
    public String nome;
    public double valorCusto;
    public int quantidade;

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nValorCusto: " + valorCusto + "\nQuantidade: " + quantidade;
    }
    
    public double calcularTotal(){
        return this.valorCusto * this.quantidade;
    }
    
    public double calcularJuros(){
        return this.calcularTotal() * 1.25;
    }
    
    public double calcularDesconto(){
        return this.calcularTotal() * 0.91;
    }
}