package Model;

public class Calculadora {
    private double n1;
    private double n2;
    private String op;
    
    public void setN1(String n1) {
        this.n1 = Double.parseDouble(n1);
    }

    public void setN2(String n2) {
        this.n2 = Double.parseDouble(n2);
    }

    public void setOp(String op) {
        this.op = op;
    }
    
    public double calcular(){
        double res = 0;
        switch(op){
            case "mais":
                res = n1 + n2;
                break;
            case "menos":
                res = n1 - n2;
                break;
            case "vezes":
                res = n1 * n2;
                break;
            case "dividir":
                res = n1 / n2;
                break;
        }
        return res;
    }
}
