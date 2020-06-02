package Model;


public class Numero {
    private int n1;
    private int n2;
    private int n3;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "Primeiro número: " + n1 + "\nSegundo número: " + n2 + "\nTerceiro número: " + n3;
    }
    
    public int encontrarMaior(){
        if(n1 > n2 && n1 > n3){
            return n1;
        } else if(n2 > n1 && n2 > n3){
            return n2;
        } else{
            return n3;
        }
    }
    
    public int encontrarMenor(){
        if(n1 < n2 && n1 < n3){
            return n1;
        } else if(n2 < n1 && n2 < n3){
            return n2;
        } else{
            return n3;
        }
    }
}
