package com.example;

public class Data {

    private int dia;
    private int mes;
    private int ano;


public Data (int dia,int mês,int ano){
    this.dia = dia;
    this.mes = mês;
    this.ano = ano;
}

public int getdia () {
    return dia;
}
public void  setdia (int dia){
    this.dia = dia;
}

public int getmes (){
    return mes;
}
public void setmes (int mes){
    this.mes=mes;
}

public int ano (){
    return ano;
}
public void setano (int ano){
    this.ano = ano;
}

public String toString() {
    // Retorna a data no formato DD/MM/AAAA
    return String.format("%02d/%02d/%d", dia, mes, ano);}}