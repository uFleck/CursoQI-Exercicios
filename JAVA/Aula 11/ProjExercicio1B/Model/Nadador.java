package Model;


public class Nadador {
    private String nome;
    private byte idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(byte idade){
        this.idade = idade;
    }
    
    public byte getIdade(){
        return idade;
    }
    
    @Override
    public String toString(){
        return "\nNome: " + nome + "\nIdade: " + idade;
    }
    
    public String verClassificacao(){
         if(idade >= 8 && idade <= 10){
            return "Infantil";
        } else if(idade >= 11 && idade <= 12){
            return "Pré-Adolescente";
        } else if(idade >= 13 && idade <= 17){
            return "Adolescente";
        } else if(idade >= 18 && idade <= 60){
            return "Adulto";
        } else{
            return "Idoso";
        }
    }
}
