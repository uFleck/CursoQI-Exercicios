package Model;


public class Funcionario {
    private String nome;
    private int cpf;
    private double horasTrabalhadas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nCPF: " + cpf + "\nHoras trabalhadas: " + horasTrabalhadas;
    }
    
    public double salarioBruto(){
        return 50 * horasTrabalhadas;
    }
    
    public double salarioBrutoAumento(){
        return salarioBruto() * 1.10;
    }
}
