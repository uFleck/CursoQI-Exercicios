package Model;


public class Modelo {
    private String nome;
    private double peso;
    private double altura;
    private String corOlhos;
    private String corCabelos;
    private byte sexo;

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

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getCorCabelos() {
        return corCabelos;
    }

    public void setCorCabelos(String corCabelos) {
        this.corCabelos = corCabelos;
    }

    public byte getSexo() {
        return sexo;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }    

    @Override
    public String toString() {
        String textoSexo;
        if(this.sexo == 1){
            textoSexo = "Feminino";
        } else if(this.sexo == 2){
            textoSexo = "Masculino";
        } else{
            textoSexo = "inválido";
        }
        return "\nNome: " + nome + "\nPeso: " + peso + "\nAltura: " + altura + "\nCor dos olhos: " + corOlhos + "\nCor dos cabelos: " + corCabelos + "\nSexo: " + textoSexo;
    }
    
    
}
