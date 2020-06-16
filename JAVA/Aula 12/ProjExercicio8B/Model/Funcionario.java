package Model;


public class Funcionario {
    private String nome;
    private double valorHora;
    private double cargaHoraria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nValor por hora: " + valorHora + "\nCarga Horaria: " + cargaHoraria;
    }
    
    public double calcularSalario(){
        return valorHora * cargaHoraria;
    }
}
