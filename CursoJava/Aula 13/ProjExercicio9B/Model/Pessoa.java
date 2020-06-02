package Model;


public class Pessoa {
    private int anoNascimento;
    private int anoAtual;
    
    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int diaNascimento) {
        this.anoNascimento = diaNascimento;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    @Override
    public String toString() {
        return "Ano de nascimento: " + anoNascimento + "\nAno atual: " + anoAtual;
    }
    
    public int calcularIdade(){
        return anoAtual - anoNascimento;
    }
    public int converterMeses(){
        return calcularIdade() * 12;
    }
    
    public int converterSemanas(){
        return calcularIdade() * 52;
    }
    
    public int converterDias(){
        return calcularIdade() * 365;
    }
    
    public int converterHoras(){
        return calcularIdade() * 8760;
    }
    
    public int converterMinutos(){
        return calcularIdade() * 525600;
    }
    
    public int converterSegundos(){
        return calcularIdade() * 31557600;
    }
}    
    