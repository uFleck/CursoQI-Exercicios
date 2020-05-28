package Model;


public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private int numeroFaltas;
    private int numeroAulas;

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

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void setNumeroFaltas(int faltas) {
        this.numeroFaltas = faltas;
    }

    public int getNumeroAulas() {
        return numeroAulas;
    }

    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nPrimeira nota: " + nota1 + "\nSegunda nota: " + nota2 + "\nNúmero de faltas: " + numeroFaltas + "\nNúmero de aulas: " + numeroAulas;
    }
    
    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }
    
    public double calcularFrequencia(){
        return ((numeroAulas - numeroFaltas) * 100) / numeroAulas;
    }
    
    public String resultado(){
        if(calcularMedia() < 2){
            return "O aluno foi reprovado por nota.";
        } else if(calcularMedia() > 2 && calcularMedia() < 5.9 && calcularFrequencia() < 75){
            return "O aluno foi reprovado por faltas.";
        } else if(calcularMedia() > 2 && calcularMedia() < 5.9 && calcularFrequencia() >= 75){
            return "O aluno está de recuperação.";
        } else if(calcularMedia() >= 6 && calcularFrequencia() < 75){
            return "O aluno foi reprovado por faltas.";
        } else if(calcularMedia() >= 8 && calcularFrequencia() >= 80){
            return "O aluno foi aprovado com Láurea.";
        } else if(calcularMedia() >= 6 && calcularFrequencia() >= 75){
            return "O aluno foi aprovado.";
        } else{
            return "erro.";
        }
    }
}
