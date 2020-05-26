package Model;


public class Carro {
    public double custoFabrica;
    
    @Override
    
    public String toString(){
        return "\nCusto de Fábrica: " + custoFabrica;
    }
    
    public double calcularPreco(){
        return (this.custoFabrica * 1.28) * 1.45;
    }
}
