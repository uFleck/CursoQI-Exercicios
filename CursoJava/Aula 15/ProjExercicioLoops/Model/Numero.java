package Model;


public class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nNúmero: " + numero;
    }
    
    public int calcularSomatorio(){
        int i = 1;
        int acum = 0;
        while(i <= numero){
            acum += i;
            i++;
        }
        return acum;
    }
    
    public int calcularFatorial(){
        int i = 1;
        int acum = 1;
        while(i <= numero){
            acum *= i;
            i++;
        }
        return acum;
    }    
    
    public int verPares(){
        int i = 1;
        int n = 0;
        while(i <= numero){
            if(i % 2 == 0){
                n++;
            }
            i++;
        }
        return n;
    }
    
    public int verImpares(){
        int i = 1;
        int n = 0;
        while(i <= numero){
            if(i % 2 == 1){
                n++;
            }
            i++;
        }
        return n;
    }
}
