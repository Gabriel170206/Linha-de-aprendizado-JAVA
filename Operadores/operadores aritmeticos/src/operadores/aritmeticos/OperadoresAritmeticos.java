/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores.aritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        System.out.println("Vamos efetuar contas aritméticas de adição, subtração, multiplicação, divisão e modulo. ");
        Scanner leitorDeValores= new Scanner(System.in);
        
        System.out.print("Digite um número e ele será um dos valores de todas as operações aritméticas. ");
        int valor1= leitorDeValores.nextInt();
        
        System.out.print("Digite outro número e ele será um dos valores de todas as operações aritméticas. ");
        int valor2= leitorDeValores.nextInt();
        
        System.out.println("Os valores escolhidos somados resultam em: " +(valor1 + valor2)+ " !");
        System.out.println("Os valores escolhidos subtraido resultam em: " +(valor1 - valor2)+ " !");
        System.out.println("Os valores escolhidos multiplicado resultam em: " +(valor1 * valor2)+ " !");
        System.out.println("Os valores escolhidos divididos resultam em: " +(valor1 / valor2)+ " !");
        System.out.println("Os valores escolhidos dividido em modulo resultam em: " +(valor1 % valor2)+ " !");
        
        leitorDeValores.close();
    }
    
}
