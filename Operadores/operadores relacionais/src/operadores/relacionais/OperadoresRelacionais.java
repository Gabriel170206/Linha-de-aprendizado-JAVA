/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores.relacionais;

import java.util.Scanner;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        System.out.println("Vamos fazer comparativo de valores booleanos");
        System.out.println("Digite dois valores como desejar, depois será feito um comparativos entre eles.");
        
        Scanner leitorValor= new Scanner(System.in);
        System.out.println("Digite o primeiro valor que vier em sua cabeça!");
        int firsValor= leitorValor.nextInt();
        System.out.println("Digite o segundo valor que vier em sua cabeça!");
        int secondValor= leitorValor.nextInt();
        leitorValor.close();
        
        boolean maiorQue = firsValor >= secondValor;
        boolean menorQue = firsValor <= secondValor;
        boolean diferenteDe = firsValor != secondValor;
        boolean igualzin = firsValor == secondValor;  //Pra esse algoritmo é muito opcional adicionar esse operador.
        System.out.println("Afirmamos que "+firsValor+" é maior ou igual que "+secondValor+" logo a afirmação é "+ maiorQue);
        System.out.println("Afirmamos que "+firsValor+" é menor ou igual que "+secondValor+" logo a afirmação é "+ menorQue);
        System.out.println("Afirmamos que "+firsValor+" é diferente de "+secondValor+" logo a afirmação é "+ diferenteDe);
        System.out.println("Afirmamos que "+firsValor+" é igualzin de "+secondValor+" logo a afirmação é "+ igualzin);
        
        
    }
    
}
