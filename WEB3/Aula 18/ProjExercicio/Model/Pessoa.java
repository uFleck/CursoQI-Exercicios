package Model;

import java.util.Arrays;

public class Pessoa {
    private int[] idade;
    
    public Pessoa(){
        this.idade = new int[20];
    }

    public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }
    
    public void cadastrar(byte i, int idade){
        this.idade[i] = idade;
    }

    @Override
    public String toString() {
        return "Idades cadastradas: " + Arrays.toString(idade);
    }
    
    public double calcularMedia(){
        double acum = 0;
        for(byte i = 0; i < idade.length; i++){
            acum += idade[i];
        }
        return acum / idade.length;
    }
    
    public int verMaiorIdade(){
        int mIdade = 0;
        for(byte i = 0; i < idade.length; i++){
            if(idade[i] > mIdade){
                mIdade = idade[i];
            }
        }
        return mIdade;
    }
    
    public byte verMaior18(){
        byte mIdade = 0;
        for(byte i = 0; i < idade.length; i++){
            if(idade[i] >= 18){
                mIdade++;
            }
        }
        return mIdade;
    }
}
