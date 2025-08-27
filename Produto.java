package com.example;

public class Produto {
    private String nome;
    private double custo;
    private Data dataDeEntrada;
    private Data dataDeValidade;
    private String codigo;
    private int quantidadeEstoque;
    private String descricao;
    
    public Produto (String nome, double custo, Data dataDeEntrada,Data dataDeValidade,String codigo,int quantidadeEstoque,String descricao){
    this.nome = nome;
    this.custo = custo;
    this.dataDeEntrada = dataDeEntrada;
    this.dataDeValidade = dataDeValidade;
    this.codigo=codigo;
    this.quantidadeEstoque = quantidadeEstoque;
    this.descricao = descricao;
}


public String getnome(){
    return nome;
}
public void setnome (String nome){
    this.nome = nome;
}

public double getcusto (){
    return custo;
}
public void setcusto (double custo){
    this.custo = custo;
}

public Data  getdataDeEntrada () {
    return dataDeEntrada;
}
public void setdataDeEntrada (Data dataDeEntrada){
    this.dataDeEntrada = dataDeEntrada;

}

public Data getdataDeValidade (){
    return dataDeValidade;
}
public void setdataDeValidade (Data dataDeValidade){
    this.dataDeValidade = dataDeValidade;
}

public String getcodigo() {
    return codigo;
}

public void setcodigo (String codigo){
    this.codigo =codigo;
}

public int getquantidadeEstoque (){
    return quantidadeEstoque;
}

public void setquantidadeEstoque (int quantidadeEstoque){
    this.quantidadeEstoque = quantidadeEstoque;
}

public String getdescricao (){

    return descricao;
}

public void setdescricao (String descricao){

    this.descricao = descricao;
}



public String toString() {
    // Retorna a string formatada com todos os detalhes do produto
    return String.format("Produto [codigo=%s, nome=%s, custo=%.2f, quantidadeEstoque=%d, " +
                         "dataDeEntrada=%s, dataDeValidade=%s, descricao=%s]", 
                         codigo, nome, custo, quantidadeEstoque, dataDeEntrada, dataDeValidade, descricao);
}


}




