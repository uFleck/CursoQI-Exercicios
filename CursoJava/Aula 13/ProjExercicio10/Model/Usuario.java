package Model;

import java.text.DecimalFormat;

public class Usuario {
    private String nome;
    private int idade;
    private byte genero;
    private int dinheiro;
    private int nivel;
    private int progressoNivel;
    private int dinheiroNivel;
    
    DecimalFormat df = new DecimalFormat("#,###,###");
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public byte getGenero() {
        return genero;
    }

    public void setGenero(byte genero) {
        this.genero = genero;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getProgressoNivel() {
        return progressoNivel;
    }

    public void setProgressoNivel(int progressoNivel) {
        this.progressoNivel = progressoNivel;
    }

    public int getDinheiroNivel() {
        return dinheiroNivel;
    }

    public void setDinheiroNivel(int dinheiroNivel) {
        this.dinheiroNivel = dinheiroNivel;
    }
    
    @Override
    public String toString() {
        String txtGenero;
        switch(genero){
            case 1:
                txtGenero = "Masculino";
                break;
            case 2:
                txtGenero = "Feminino";
                break;
            default:
                txtGenero = "Inválido";
        }
        return "Nome: " + nome + "\nIdade: " + idade + "\nGênero: " + txtGenero + "\nDinheiro: " + df.format(dinheiro) + "\nNível: " + nivel + "   " + progressoNivel + "%";
    }
}
