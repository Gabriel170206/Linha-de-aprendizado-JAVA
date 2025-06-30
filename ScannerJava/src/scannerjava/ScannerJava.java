/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerjava;

import java.util.Scanner;

public class ScannerJava {

    public static void main(String[] args) {
        Scanner questionPeople= new Scanner(System.in);
        System.out.print("Diga sua idade!");
        int idade = questionPeople.nextInt();
        System.out.print("Diga seu peso");
        float peso= questionPeople.nextFloat();
        System.out.println(idade+" anos e fulano tem o peso de "+ peso);
        questionPeople.close();
        
        
    }
    
}

/*
*[Considerações finais]
*-Manipulação de Scanner pra leitura da escrita do usuário;
*-Uso de biblioteca para a class Scanner;
*/