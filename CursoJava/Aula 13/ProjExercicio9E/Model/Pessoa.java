package Model;


public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nPeso: " + peso + "\nAltura: " + altura;
    }
    
    public double calcularIMC(){
        return peso / Math.pow(altura, 2);
    }
    
    public String verCategoria(){
        if(calcularIMC() < 18.5){
            return "abaixo do peso.";
        } else if(calcularIMC() >= 18.5 && calcularIMC() < 25){
            return "o peso ideal.";
        } else if(calcularIMC() >= 25 && calcularIMC() < 30){
            return "sobrepeso.";
        } else if(calcularIMC() >= 30 && calcularIMC() < 35){
            return "obesidade grau 1.";
        } else if(calcularIMC() >= 35 && calcularIMC() < 40){
            return "obesidade grau 2.";
        } else{
            return "obesidade grau 3";
        }
    }
}
