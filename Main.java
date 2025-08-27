package com.example;
import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main (String args[]){
    
         try (Scanner scanner = new Scanner(System.in)) {
         Estoque estoque = new Estoque();
            
         while (true){ // laço simples para o menu
            System.out.println("bem vindo a o seu estoque");
            System.out.println("digite o número 1 caso deseje adicionar um produto no estoque");
            System.out.println("digite o número 2 para retirar um produto do seu estoque");
            System.out.println("digite o número 3 para buscar um produto no estoque");    
            System.out.println("digite o número 4 para atualizar as informações de um produto");
            System.out.println("digite 5 para ver todos os produtos disponiveis no estoque");
            System.out.println("digite 0 para sair do menu");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
            case 1: { // adiciona um produto no estoque
              
            System.out.println("digite o nome do produto");
           
            String nome = scanner.nextLine();
            
            
            System.out.println("digite o custo do produto");
            
             double custo = scanner.nextDouble();
             scanner.nextLine();  
            
             System.out.println("digite o código do produto");
           
             String codigo = scanner.nextLine();
             scanner.nextLine();  
            
             System.out.println("digite a quantidade que ira entrar no estoque");
            
             int quantidadeEstoque = scanner.nextInt();
             scanner.nextLine();  
            
             System.out.println("digite a descrição do seu produto");
           
             String descricao = scanner.nextLine();
             
           
             System.out.println("digite o dia, mes e ano que o produto está entrandoo no estoque ");

             int diaEntrada = scanner.nextInt();
             scanner.nextLine();
            
             int mesEntrada = scanner.nextInt();
             scanner.nextLine();
            
             int anoEntrada = scanner.nextInt();
             scanner.nextLine();
             
             Data dataDeEntrada = new Data(diaEntrada,mesEntrada,anoEntrada);

             System.out.println("digite a data de validade do produto");
            
             int diaValidade = scanner.nextInt();
             scanner.nextLine();
             
             int mesValidade = scanner.nextInt();
             scanner.nextLine();
            
             int anoValidade = scanner.nextInt();
             scanner.nextLine();
           
             Data dataDeValiDade = new Data(diaValidade, mesValidade, anoValidade);
             
             Produto produto = new Produto(nome, custo, dataDeEntrada, dataDeValiDade, codigo, quantidadeEstoque, descricao);
             estoque.adicionarproduto(produto);
             System.out.println("produto criado com sucesso");
               break;}
        
            case 2 : { // apaga um produto do estoque

             System.out.println("digite o código do produto que deseja apagar");
              
             String codigo1 = scanner.nextLine();
             scanner.nextLine();
             estoque.removeproduto(codigo1);
             break;
            }
            case 3 : { // busca um produto no estoque pelo seu codigo

             System.out.println("digite o código do produto para busca-lo no estoque");
             String codigo2 = scanner.nextLine();
             
             estoque.buscarprodutoporcodigo(codigo2);
             break;
            }    
           
            case 4: { //atualiza as informações do produto no estoque

                System.out.println("digite o código do produto que deseja atualizar");
                
                String codigo3 = scanner.nextLine();
                scanner.nextLine();
                
                System.out.println("digite o novo nome do produto");
                
                String nomenovo = scanner.nextLine();
                scanner.nextLine();
                
                System.out.println("digite o novo custo do produto");
                
                double custonovo = scanner.nextDouble();
                scanner.nextLine();  
               
                 
               
                System.out.println("digite a nova quantidade que ira entrar no estoque");
                int quantidadeEstoquenovo = scanner.nextInt();
                scanner.nextLine();  
               
                System.out.println("digite a nova descrição do seu produto");
                
                String descricaonovo = scanner.nextLine();
                scanner.nextLine();
               
                System.out.println("digite o novo dia, mes e ano que o produto está entrando no estoque ");
   
                int diaEntradanovo = scanner.nextInt();
                scanner.nextLine();
                
                int mesEntradanovo = scanner.nextInt();
                scanner.nextLine();
                
                int anoEntradanovo = scanner.nextInt();
                scanner.nextLine();
               
                Data dataDeEntradanovo = new Data(diaEntradanovo,mesEntradanovo,anoEntradanovo);
   
                System.out.println("digite a nova data de validade do produto");
               
                int diaValidadenovo = scanner.nextInt();
                scanner.nextLine();
                
                int mesValidadenovo = scanner.nextInt();
                scanner.nextLine();
                
                int anoValidadenovo = scanner.nextInt();
                scanner.nextLine();
               
                Data dataDeValiDadenovo = new Data(diaValidadenovo, mesValidadenovo, anoValidadenovo);
                
                estoque.atualizarproduto(nomenovo, custonovo, dataDeEntradanovo, dataDeValiDadenovo, codigo3, quantidadeEstoquenovo, descricaonovo);
                break;
            }   
           
            case 5: {

                System.out.println("esses são os produtos contidos no seu estoque");
                 
                    estoque.listarprodutos();  
             break;
            }
            case 0: {
             System.out.println("você está saindo do sistema");
             return;

            }  
        
        
        }
          
          
            }
            
         
         
        } catch (Exception e) {
            // Captura qualquer exceção e imprime o stack trace
            e.printStackTrace();}
         
        }
    }

 
        
        

          
       
    
    

          

     

