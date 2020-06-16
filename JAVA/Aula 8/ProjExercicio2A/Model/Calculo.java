package Model;


public class Calculo {
    public double valor1;
    public double valor2;
    public double valor3;
    
    @Override
    
    public String toString(){
        return "\nValor1: " + valor1 + "\nValor2: " + valor2 + "\nValor3: " + valor3;
    }
    
    public double calcularProduto(){
        return this.valor1 * this.valor2 * this.valor3;
    }
}
