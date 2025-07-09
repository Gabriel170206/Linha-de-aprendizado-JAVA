package iteracao;

import java.util.Scanner;

public class Iteracao {

    public static void main(String[] args) {
        /*
        //iteração while
        int valor1= 12;
        boolean test = valor1 > 4;
        
        while(test){
            System.out.println("O valor da variável é "+valor1);
            valor1 -=3;
            
            if(valor1 <= 4){
                System.out.println("o valor of var é menor ("+ valor1 +")");
                break;
            }
        }
        */
        
        
        //Iteração for 
        System.out.println("Para ver uma partida de football é necessário gastar com ingressos para adquirir os assentos.");
        
        Scanner jogoDoEstadio = new Scanner(System.in);
            System.out.println("Cada assento custa R$ 70,00, quantos deseja comprar? ");
            int bancosComprados = jogoDoEstadio.nextInt(); //Diz quantos bancos o User deseja &&  quando for armazenar uma valor que envolva a resposta do user, deixe este armazem dentro do Scanner 
            int[] precoPorBanco = new int[] {0 , 70 , 140 , 210 , 280 , 350 , 420 , 490 , 560 , 630 , 700 };
            int valorMonetario = precoPorBanco[bancosComprados]; //Diz o valor atual gasto nos bancos
            int valorMonetarioAdicional = valorMonetario + precoPorBanco[bancosComprados]; //Diz valores adicionais aos bancos existentes
            int carteiraLimitada = 700 ;
            System.out.println("você comprou "+bancosComprados+" pelo valor de R$ "+valorMonetario);
            System.out.println("Apareceram alguns conhecidos seus e você decide comprar alguns assentos.");
            
            /*
                for(valorMonetario = valorMonetario ; valorMonetario < 500 ; bancosComprados +=  1 ){
                    valorMonetario = precoPorBanco[bancosComprados]; //Diz o valor atual gasto nos bancos
                    System.out.println("você comprou "+bancosComprados+" pelo valor de R$ "+valorMonetario);

                    if(valorMonetario > 0){
                        System.out.println("Deseja comprara mais um assento?");
                        String compreMaisBancos = jogoDoEstadio.next();
                        if (compreMaisBancos = "s"){

                        }


                    }

                    if(valorMonetario > 500 ){
                        System.out.println("Você não quer comprar mais assentos para as pessoas!");
                        break;
                    }

                }
            */
            while(valorMonetario < 500){
                bancosComprados += 1;
                valorMonetario = precoPorBanco[bancosComprados]; //Diz o valor atual gasto nos bancos
                System.out.println("você comprou "+bancosComprados+" pelo valor de R$ "+valorMonetario);
                
            }
        jogoDoEstadio.close();
        
    }
    
}
