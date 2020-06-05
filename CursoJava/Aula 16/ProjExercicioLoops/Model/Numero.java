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
    
    public long calcularFatorial(){
        int i = 1;
        long acum = 1;
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
    
    public String verSeEParOuImpar(){
        String parImpar;
        if(numero % 2 == 0){
            parImpar = "Par.";
        } else{
            parImpar = "Ímpar.";
        }
        return parImpar;
    }
    
    public String VerSeONumeroEPositivoNegativoOuNulo(){
        String res;
        if(numero > 0){
            res = "Positivo.";
        } else if(numero < 0){
            res = "Negativo.";
        } else{
            res = "Nulo.";
        }
        return res;
    }
    
    public double calcularRaizQuadradaDoNumero(){
        return Math.sqrt(numero);
    }
    
    public double calcularDobroDoNumero(){
        return numero * 2;
    }
    public String calcularTabuadaDoNumero(){
        String res = numero + " x " + 0 + " = " + (numero * 0);
        for(int i = 1; i <= 10; i++){
            res += "\n" + numero + " x " + i + " = " + (numero * i);
        }
        return res;
    }
}
