package Model;


public class Numero {
    private int n;
    
    public void setN(int n){
        this.n = n;
    }
    
    public int getN(){
        return n;
    }
    
    @Override
    public String toString(){
        return "\nNúmero: " + this.n;
    }
    
    public String verResultado(){
        if (n % 2 == 0){
            return "O número que você escolheu(" + this.n + ") é par.";
        } else{
            return "O número que você escolheu(" + this.n + ") é ímpar.";
        }
    }
}
