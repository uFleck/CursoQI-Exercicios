package Model;


public class Numero {
    private int n;
    
    public void setN (int n){
        this.n = n;
    }
    
    public int getN(){
        return n;
    }

    @Override
    public String toString(){
        return "Número: " + n;
    }
    
    public String verResultado(){
        if(this.n > 100){
            return "O número que você escolheu(" + this.n + ") é maior que 100.";
        } else if(this.n == 100){
            return "O número que você escolheu(" + this.n + ") é igual a 100.";
        } else{
            return "O número que você escolheu(" + this.n + ") é menor que 100";
        }
    }
}
