package Model;

import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Contato> lista;

    public Cadastro() {
        this.lista = new ArrayList<>();
    }
    
    public ArrayList<Contato> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Contato> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Lista de contatos: \n" + lista;
    }
    
    public void cadastrar(Contato c){
        this.lista.add(c);
    }
    
    public void excluir(Contato c){
        this.lista.remove(c);
    }
    
    public int verQuantidade(){
        return this.lista.size();
    }
    
    int tamanhoLista = this.lista.size();
    public Contato pesquisarContatoCodigo(int codigo){
        Contato achei = null;
        for(int i = 0; i < tamanhoLista; i++){
            if(this.lista.get(i).getCodigo() == codigo){
                achei = this.lista.get(i);
            }
        }
        return achei;
    }
    
    public Contato pesquisarContatoCelular(int telCelular){
        Contato achei = null;
        for(int i = 0; i < tamanhoLista; i++){
            if(this.lista.get(i).getTelCelular() == telCelular){
                achei = this.lista.get(i);
            }
        }
        return achei;
    }
}
