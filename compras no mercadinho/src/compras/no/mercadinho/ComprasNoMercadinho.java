package compras.no.mercadinho;

import java.util.Scanner;

public class ComprasNoMercadinho {

    public static void main(String[] args) {
        /*
        *   História fictícea. 
        *   Roberto quer fazer compras do mercado  para sua casa e ele quer pagar pelo mais barato possivel.
        *   Na seção de alimentos ele queria comprar um biscoito recheado, ele tinha três opções que eram "Chocodelicia", "Macaquito" e "Tranqueiras". 
        *   Respectivamente os preços de cada um eram de R$ 7,50 ; R$ 8,99 ; R$ 6,49 .
        */
        
        System.out.println("há um produto limitado em promoção, são três biscoitos recheados limitados, escolha dentre 0 e 4. ");
       Scanner compraNoMercado = new Scanner(System.in);
            String[] produtosAlimento = new String[] {"Escolha a opção dentre zero e quatro ", "Chocodelicia", "Macaquito", "Tranqueiras"};
            double[] valorProdutodo = new double[] {7.50 , 8.99 , 6.49};
            int escolhaDoProduto = compraNoMercado.nextInt();
            String produtoEscolhido = produtosAlimento[escolhaDoProduto];

        if(produtoEscolhido == "Chocodelicia" ) {
            System.out.println("O produto escolhido foi "+produtoEscolhido+" ele custa R$ "+valorProdutodo[0]);
            System.out.println("Deseja levar este produto? Responda sim ou não");
        }
        else if(produtoEscolhido == "Macaquito" ) {
            System.out.println("O produto escolhido foi "+produtoEscolhido+" ele custa R$ "+valorProdutodo[1]);
            System.out.println("Deseja levar este produto? Responda sim ou não");
        }
        else if(produtoEscolhido == "Tranqueiras" ) {
            System.out.println("O produto escolhido foi "+produtoEscolhido+" ele custa R$ "+valorProdutodo[2]);
            System.out.println("Deseja levar este produto? Responda sim ou não");
        }
        
        String possivelCompra = compraNoMercado.next();
        
        if("s".equals(possivelCompra) || "S".equals(possivelCompra)|| "sim".equals(possivelCompra) || "SIM".equals(possivelCompra)) {
            System.out.println("você então comprou! Obrigado.");
            
        }
        else{
            System.out.println("Então por favor escolha denovo!");
        }
        
        
        compraNoMercado.close();
    }
    
}
