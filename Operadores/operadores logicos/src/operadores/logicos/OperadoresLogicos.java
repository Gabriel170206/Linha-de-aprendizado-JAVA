package operadores.logicos;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
        System.out.println("Uma história totalmente ficticea será inventada!");
        System.out.println("Num estabelecimento de bebidas alcólicas, há um evento de quem come mais cachorro quente.");
        System.out.println("Onde o vencedor ganhará o dinheiro apostado de outros competidores do evento.");
        System.out.println("Há condições para participar do evento como ser maior de 18 anos, não possui mais que 0,04mg/L de alcool no oraganismo e possuir grana para compensar o valor apostado ");
        System.out.println("Responda o dono do estabelecimento sua caractéristica e suas condições.");
        
        Scanner questEnter = new Scanner(System.in);
            System.out.println("Qual sua idade?");
                int idade = questEnter.nextInt();
            System.out.println("Qual a concentração de alcool em seu organismo?");
                float concentAlcool = questEnter.nextFloat();
            System.out.println("Quantos reais você possui no bolso pra competir? O mínimo é de R$ 30.");
                double minhaCarteira = questEnter.nextDouble();
        questEnter.close();
        
        boolean condictionIdade =  idade >= 18;
        boolean condictionConcentAlcool =  concentAlcool < 0.04;
        boolean condictionMinhaCarteira =  idade >= 30;
        
        boolean sentecasToENter= condictionIdade && condictionConcentAlcool && condictionMinhaCarteira;  
        
        System.out.println("Para cumprir com sua entrada, suas três sentenças tem que serem [True]");
        System.out.println("vemos que  as suas sentenças resultam em "+sentecasToENter+" !");
    }
    
}
