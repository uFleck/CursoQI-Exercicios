
package Model;

public class Retangulo {
    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "\nAltura: " + altura + "\nBase: " + base;
    }
    
    public double calcularArea(){
        return this.base * this.altura;
    }
}
