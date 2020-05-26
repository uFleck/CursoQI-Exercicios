package Model;


public class Pessoa {
    private int anoNascimento;
    private int anoAtual;

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    @Override
    public String toString() {
        return "\nAno de nascimento: " + anoNascimento + "\nAno atual: " + anoAtual;
    }
    
    public int calcularIdade(){
        return this.anoAtual - this.anoNascimento;
    }
    
    public int calcularIdadeFuturo(){
        return 2030 - this.anoNascimento;
    }
}
