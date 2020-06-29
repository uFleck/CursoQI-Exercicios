package Model;

import java.text.DecimalFormat;


public class Funcionario {
    private String nome;
    private String cpf;
    private String cargo;
    private double valorHora;
    private double quantHoras;
    private double horasExtras50;
    private double horasExtras100;
    private byte dependentes;
    private byte tipoInsalubre;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setValorHora(String valorHora) {
        this.valorHora = Double.parseDouble(valorHora);
    }

    public void setQuantHoras(String quantHoras) {
        this.quantHoras = Double.parseDouble(quantHoras);
    }

    public void setHorasExtras50(String horasExtras50) {
        this.horasExtras50 = Double.parseDouble(horasExtras50);
    }

    public void setHorasExtras100(String horasExtras100) {
        this.horasExtras100 = Double.parseDouble(horasExtras100);
    }

    public void setDependentes(String dependentes) {
        this.dependentes = Byte.parseByte(dependentes);
    }

    public void setTipoInsalubre(String tipoInsalubre) {
        this.tipoInsalubre = Byte.parseByte(tipoInsalubre);
    }
    
    public double calcularBruto(){
        return valorHora * quantHoras;
    }
    
    double valeTransporte;
    double valorTransporteMensal;
    
    public double calcularValeTransporte(){
        double porc = calcularBruto() * 0.06;
        if(porc <= valorTransporteMensal){
            valeTransporte = porc;
        } else{
            valeTransporte = 0;
        }
        return valeTransporte;
    }
    
    public void setValorTransporteMensal(String valorTransporte){
        valorTransporteMensal = Double.parseDouble(valorTransporte);
    }
    
    public double calcularSalarioFamilia(){
        double sBruto = calcularBruto();
        if(sBruto <= 907.77){
            return dependentes * 46.54;
        }else if(sBruto <= 1364.43){
            return dependentes * 32.80;
        }else{
            return 0;
        }
    }
    public double calcularInsalubridade(){
        switch (tipoInsalubre) {
            case 1:
                return 997 * 0.40;
            case 2:
                return 997 * 0.20;
            case 3:
                return 997 * 0.10;
            default:
                return 0;
        }
    }
    
    public double calcularINSS(){
        double sBruto = this.calcularBruto();
        if(sBruto <= 1751.81){
            sBruto *= 0.08;
        } else if(sBruto <= 2919.72){
            sBruto *= 0.09;
        } else if(sBruto <= 5839.45){
            sBruto *= 0.11;
        } else{
            sBruto *= 0.27;
        }
        return sBruto;
    }
    
    double valeRefeicao;
    double valorVale;
    public double calcularValeRefeicao(){
        valeRefeicao = (25 * valorVale) * 0.20;
        return valeRefeicao;
    }
    
    public void setValorVale(String valorVale){
        this.valorVale = Double.parseDouble(valorVale);
    }
    
    public double calcularExtra50 (){
        return (valorHora * horasExtras50) * 1.5;
    }
    
    public double calcularExtra100 (){
        return (valorHora * horasExtras100) * 2;
    }
    
    public double calcularTotalExtra(){
        return calcularExtra50() + calcularExtra100();
    }
    
    public double calcularBeneficio(){
        return calcularSalarioFamilia() + calcularTotalExtra() + calcularInsalubridade();
    }
    
    public double calcularDesconto(){
        return valeTransporte + valeRefeicao + calcularINSS();
    }
    
    public double calcularLiquido(){
        return calcularBruto() + calcularBeneficio() - calcularDesconto();
    }
    
    public static String format(double x) {  
        DecimalFormat df = new DecimalFormat("#0.00");  
        return df.format(x);
    }
}