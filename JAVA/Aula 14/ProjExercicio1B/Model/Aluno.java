package Model;


public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private String escola;
    
    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.escola = "Qi";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nPrimeira Nota: " + nota1 + "\nSegunda Nota: " + nota2 + "\nTerceira Nota: " + nota3 + "\nEscola: " + escola;
    }
    
    public double calcularMedia(double peso1, double peso2, double peso3){
        return (this.nota1 * peso1 + this.nota2 * peso2 + this.nota3 * peso3) / (peso1 + peso2 + peso3); 
    }
}
