package Model;


public class Pessoa {
    private double altura;
    private byte sexo;
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setSexo(byte sexo){
        this.sexo = sexo;
    }
    
    public byte getSexo(){
        return sexo;
    }
    
    @Override
    public String toString(){
        String textoSexo;
        switch (sexo) {
            case 1:
                textoSexo = "Feminino.";
                break;
            case 2:
                textoSexo = "Masculino.";
                break;
            default:
                textoSexo = "Inválido.";
                break;
        }
        return "Altura: " + altura + "\nSexo: " + sexo + " = " + textoSexo;
    }
    
    public double calcularPeso(){
        if (sexo == 1){
            return (62.1 * this.altura) - 44.7;
        } else if(sexo == 2){
            return (72.7 * this.altura) - 58;
        } else{
            return 0;
        }
    }
}
