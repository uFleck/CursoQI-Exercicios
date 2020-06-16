package Model;


public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "\nPrimeira Nota: " + nota1 + "\nSegunda Nota: " + nota2 + "\nTerceira Nota: " + nota3;
    }
    
    public double calcularMedia(){
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }
    
    public String verResultado(){
        if(this.calcularMedia() >= 6){
            return "Aprovado!";
        } else{
            return "Reprovado...";
        }
    }
}
