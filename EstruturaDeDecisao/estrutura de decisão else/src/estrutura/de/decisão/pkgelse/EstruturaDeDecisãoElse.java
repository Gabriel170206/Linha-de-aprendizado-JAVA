package estrutura.de.decisão.pkgelse;

import java.util.Scanner;

public class EstruturaDeDecisãoElse {

    public static void main(String[] args) {
         System.out.println("Você foi parado pela PRF e eles exigem saber sua idade e que possua uma CNH. Responda!");
        
        Scanner structIf= new Scanner(System.in);
            System.out.println("Qual sua idade?");
                int idade = structIf.nextInt();
                
        structIf.close();
        
        
        if (idade >= 18 ) {
            System.out.println("Tudo ok. Pode seguir viagem.");
        }
        else {
            System.out.println("Saia do veículo e ponha as mãos na cabeça!");
        } 
    }
    
}
