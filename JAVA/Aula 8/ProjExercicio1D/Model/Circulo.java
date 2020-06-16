package Model;

import java.util.*;

public class Circulo {
    private double raio;
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
    @Override
    
    public String toString(){
        return "\nRaio: " + raio;
    }
    
    public double calcularArea(){
        return Math.PI * (Math.pow(this.raio, 2));
    }
    
    public double calcularPerimetro(){
        return 2 * Math.PI * this.raio;
    }
}
