package Model;


public class Pessoa {
    private double peso;

    @Override
    
    public String toString() {
        return "Peso: " + peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public double engordar(){
        return this.peso * 1.15;
    }
    
    public double emagrecer(){
        return this.peso * 0.80;
    }
}
