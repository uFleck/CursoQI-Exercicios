package Model;


public class Contato {
    private int codigo;
    private String nome;
    private int telCelular;
    private int telResidencial;
    private String email;

    public Contato() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(int telCelular) {
        this.telCelular = telCelular;
    }

    public int getTelResidencial() {
        return telResidencial;
    }

    public void setTelResidencial(int telResidencial) {
        this.telResidencial = telResidencial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n-------------------------"
               + "\nCódigo: " + codigo 
               + "\nNome: " + nome 
               + "\nTelefone Celular: " + telCelular 
               + "\nTelefone Residencial: " + telResidencial 
               + "\nE-mail: " + email
               + "\n-------------------------\n";
    }
}
