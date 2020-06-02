package Model;


public class Posto {
    public double litrosAbastecer;
    public byte tipoCombustivel;

    public double getLitrosAbastecer() {
        return litrosAbastecer;
    }

    public void setLitrosAbastecer(double litrosAbastecer) {
        this.litrosAbastecer = litrosAbastecer;
    }

    public byte getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(byte tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        String textoTipoCombustivel;
        switch (tipoCombustivel){
            case 1:
                textoTipoCombustivel = "Gasolina";
                break;
            case 2:
                textoTipoCombustivel = "Álcool";
                break;
            case 3:
                textoTipoCombustivel = "GNV";
                break;
            case 4:
                textoTipoCombustivel = "Diesel";
                break;
            default:
                textoTipoCombustivel = "Tipo de combustível inválido";
        }
        return "Litros a Abastecer: " + litrosAbastecer + "\nTipo de Combustível: " + textoTipoCombustivel;
    }
    
    public double totalPagar(){
        if(tipoCombustivel == 1){
            return litrosAbastecer * 2.79;
        } else if(tipoCombustivel == 2){
            return litrosAbastecer * 1.99;
        } else if(tipoCombustivel == 3){
            return litrosAbastecer * 1.52;
        } else if(tipoCombustivel == 4){
            return litrosAbastecer * 1.89;
        } else{
            return 0;
        }
    }
}
