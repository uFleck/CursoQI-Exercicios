package Model;


public class Temperatura {
    public double celsius;
    
    @Override
    
    public String toString(){
        return "\nCelsius: " + celsius;
    }
    
    public double calcularFahrenheit(){
        return (this.celsius * 9 / 5) + 32;
    }     
    
    public double calcularKelvin(){
        return this.celsius + 273.15;
    }
}
