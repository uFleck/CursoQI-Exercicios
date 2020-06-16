package Model;


public class Conversor {
    private int ano;
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return ano;
    }
    
    @Override
    
    public String toString(){
        return "\nAno: " + ano;
    }
    
    public int converterMeses(){
        return this.ano * 12;
    }
    
    public int converterSemanas(){
        return this.ano * 52;
    }
    
    public int converterDias(){
        return this.ano * 365;
    }
}
