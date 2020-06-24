package Model;


public class DiaSemana {
    private int numero;
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    @Override
    public String toString(){
        return "\nNumero: " + numero;
    }
    
    public String acharDiaDaSemana(){
        if(numero == 1){
            return "O número digitado(" + numero + ") corresponde ao seguinte dia da semana: Domingo.";
        } else if(numero == 2){
            return "O número digitado(" + numero + ") corresponde ao seguinte dia da semana: Segunda-Feira.";
        } else if(numero == 3){
            return "O número digitado(" + numero + ") corresponde ao seguinte dia da semana: Terça-Feira.";
        } else if(numero == 4){
            return "O número digitado(" + numero + ") corresponde ao seguinte dia da semana: Quarta-Feira.";
        } else if(numero == 5){
            return "O número digitado(" + numero + ") corresponde ao seguinte dia da semana: Quinta-Feira.";
        } else if(numero == 6){
            return "O número digitado(" + numero + ") corresponde ao seguinte dia da semana: Sexta-Feira.";
        } else if(numero == 7){
            return "O número digitado(" + numero + ") corresponde ao seguinte dia da semana: Sábado.";
        } else{
            return "Número inválido.";
        }
    }
}
