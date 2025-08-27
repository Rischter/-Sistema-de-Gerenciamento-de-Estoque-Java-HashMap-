package com.example;

import java.util.HashMap;

public class Estoque {
   
    private HashMap <String, Produto> estoque;

public Estoque (){
    this.estoque = new HashMap <>();
}
//adiciona um produto no hashmap
public void adicionarproduto (Produto produto){

    estoque.put(produto.getcodigo(),produto); 

}


// método para ver todos os produtos existentes
public void listarprodutos (){

 if (estoque.isEmpty()) {
    System.out.println ("os estoque está vazio");
 }

 else {
    for (Produto produto : estoque.values()) {
        System.out.println(produto);
    }
 }
}
// método para buscar um produto por codigo
public Produto buscarprodutoporcodigo (String codigo){

    Produto produto = estoque.get(codigo);
    if(produto !=null){
       System.out.println("produto encontrado");
       System.out.println(produto);}

       else {
        System.out.println("produto" +codigo+"não encontrado");
       }
       return (produto);
}
       
    
//método para remover produto
public void removeproduto (String codigo){

    Produto produto = buscarprodutoporcodigo(codigo);

    if (produto != null) {
      
        estoque.remove(codigo);
        
        System.out.println("produto" + produto.getnome()+"foi removido do estoque");
    }
    else {
        System.out.println("o produto não foi encontrado no estoque");
    }
  
}
// método para atualizar informações de produto
public void atualizarproduto (String nome, double custo, Data dataDeEntrada,Data dataDeValidade,String codigo,int quantidadeEstoque,String descricao) {

    Produto produtoexistente = buscarprodutoporcodigo(codigo);

    if (produtoexistente !=null) {

        produtoexistente.setnome(nome);
        produtoexistente.setcusto(custo);
        produtoexistente.setdataDeEntrada(dataDeEntrada);
        produtoexistente.setdataDeValidade(dataDeValidade);
        produtoexistente.setcodigo(codigo);
        produtoexistente.setquantidadeEstoque(quantidadeEstoque);    
        produtoexistente.setdescricao(descricao);    
    

        System.out.println("Produto atualizado com sucesso:");
        System.out.println(produtoexistente); 
    }else {
        System.out.println("o produto não foi atualizado");
    }

 
    

    
        
        
    
    
    
    
    }


}








 
 
 
 
 
        
    

    












