package Model;


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
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(double quantHoras) {
        this.quantHoras = quantHoras;
    }

    public double getHorasExtras50() {
        return horasExtras50;
    }

    public void setHorasExtras50(double horasExtras50) {
        this.horasExtras50 = horasExtras50;
    }

    public double getHorasExtras100() {
        return horasExtras100;
    }

    public void setHorasExtras100(double horasExtras100) {
        this.horasExtras100 = horasExtras100;
    }

    public byte getDependentes() {
        return dependentes;
    }

    public void setDependentes(byte dependentes) {
        this.dependentes = dependentes;
    }

    public byte getTipoInsalubre() {
        return tipoInsalubre;
    }

    public void setTipoInsalubre(byte tipoInsalubre) {
        this.tipoInsalubre = tipoInsalubre;
    }
    
    @Override
    public String toString() {
        String txtIns;
        switch(tipoInsalubre){
            case 1:
                txtIns = "40%";
                break;
            case 2:
                txtIns = "20%";
                break;
            case 3:
                txtIns = "10%";
                break;
            default:
                txtIns = "Sem insalubridade";
        }
        return "\nNome: " + nome + "\nCPF: " + cpf + "\nCargo: " + cargo + "\nValor por Hora: " + valorHora + "\nQuantidade de Horas: " + quantHoras + "\nHoras Extras 50: " + horasExtras50 + "\nHoras Extras 100: " + horasExtras100 + "\nNúmero de Dependentes: " + dependentes + "\nTipo de Insalubridade: " + txtIns;
    }
    
    public double calcularBruto(){
        return valorHora * quantHoras;
    }
    
    double valeTransporte;
    
    public double calcularValeTransporte(double valorTransporteMensal){
        double porc = calcularBruto() * 0.06;
        if(porc <= valorTransporteMensal){
            valeTransporte = porc;
        } else{
            valeTransporte = 0;
        }
        return valeTransporte;
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
    public double calcularValeRefeicao(double valorVale){
        valeRefeicao = (25 * valorVale) * 0.20;
        return valeRefeicao;
    }
    
    public double calcularExtra50 (){
        return ((valorHora * horasExtras50) * 1.5) - (quantHoras * 1.5);
    }
    
    public double calcularExtra100 (){
        return ((valorHora * horasExtras100) * 2) - (quantHoras * 2);
    }
    
    public double calcularTotalExtra(){
        return horasExtras50 + horasExtras100;
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
}