package medidas.de.um.triangulo;

import java.util.Scanner;

public class MedidasDeUmTriangulo {
 /**
 * Faça um Programa que peça os 3 lados de um triângulo. O programa deverá
 *informar se os valores podem ser um triângulo. Indique, caso os lados formem um
 *triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
 *Dicas:
 *Três lados formam um triângulo quando a soma de quaisquer dois lados for
 *maior que o terceiro;
 * Triângulo Equilátero: três lados iguais;
 * Triângulo Isósceles: quaisquer dois lados iguais; 
 * Triângulo Escaleno: três lados diferentes;
 */
    public static void main(String[] args) {
        Scanner medidastTriangulares = new Scanner(System.in);
            System.out.println("Peça as medidas dos três lados de um triângulo ");
            int lado1 = medidastTriangulares.nextInt();
            int lado2 = medidastTriangulares.nextInt();
            int lado3 = medidastTriangulares.nextInt();
        medidastTriangulares.close();
        boolean trianguloDefinition = (lado1 + lado2) > lado3 ;
        
        if (trianguloDefinition) {
            System.out.println("Com base suas medidas, você tem um triângulo");
            
            if (    (lado1 == lado2 && lado1 == lado3) ||
                    (lado2 == lado1 && lado2 == lado3) ||
                    (lado3 == lado1 && lado3 == lado2)  
                ) {System.out.println("É um triângulo Equilátero!");}
                    
            
            else if (   (lado1 == lado2 || lado1 == lado3) ||
                        (lado2 == lado1 || lado2 == lado3) ||
                        (lado3 == lado1 || lado3 == lado2)  
                    ) {System.out.println("É um triângulo Isóceles!");}
                
            else {System.out.println(" É um triângulo Escaleno");}
        }
        else {System.out.println("Com base suas medidas, não existe um triângulo");}
        
    }
    
}
