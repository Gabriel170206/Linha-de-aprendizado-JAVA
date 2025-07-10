package equacao.pkgdo.segundo.grau;

import java.util.Scanner;

public class EquacaoDoSegundoGrau {
/**
 * Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax² + bx + c.
 *O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
 *Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores,sendo encerrado;
 *Se o delta calculado for negativo, a equação não possui raízes reais.
 *Informe ao usuário e encerre o programa;
    -Se o delta calculado for igual a zero a equação possui apenas uma raiz real;
    -Se o delta for positivo, a equação possui duas raiz reais;
 *informe-as ao usuário;
*/
    public static void main(String[] args) {
        Scanner equacaoDoSegundoGrau = new Scanner(System.in);
            System.out.println("Informe o valor de (a)");
                double valorDea = equacaoDoSegundoGrau.nextDouble();
                
                if(valorDea <= 0) {
                    System.out.println("Se o valor de (a) é igual ou menor que zero então  não é uma equação do segundo grau!");
                }
                else{
                    System.out.println("Informe o valor de (b)");
                        double valorDeb = equacaoDoSegundoGrau.nextDouble();
                    System.out.println("Informe o valor de (c)");
                        double valorDec = equacaoDoSegundoGrau.nextDouble();
                    
                        double valorDeDelta = (valorDeb * valorDeb) - 4 * valorDea * valorDec;
                        
                        double valorDex1 = (    (valorDeb * (-1.0))+ Math.sqrt(valorDeDelta) )/ 2 * valorDea ;  
                        double valorDex2 = (    (valorDeb * (-1.0))- Math.sqrt(valorDeDelta) )/ 2 * valorDea ;              
                    if(valorDeDelta < 0) {
                        System.out.println("O valor de Delta sendo "+valorDeDelta+" os resultados aguardados são de X¹= "+valorDex1+" e X²= "+valorDex2+". Pois A equação não possui raízes reais!" );
                    }
                    else if(valorDeDelta == 0) {
                        System.out.println("O valor de Delta sendo "+valorDeDelta+" os resultados aguardados são de X¹= "+valorDex1+" e X²= "+valorDex2+". Pois A equação  possui apenas uma raiz real!" );
                        
                    }
                    else if(valorDeDelta > 0) {
                        System.out.println("O valor de Delta sendo "+valorDeDelta+" os resultados aguardados são de X¹= "+valorDex1+" e X²= "+valorDex2+". Pois A equação possui duas raízes reais!" );
                        
                    }
                }
                
        equacaoDoSegundoGrau.close();
    }
    
}
