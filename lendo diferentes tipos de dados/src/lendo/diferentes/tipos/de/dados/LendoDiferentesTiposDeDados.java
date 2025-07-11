/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lendo.diferentes.tipos.de.dados;

import java.util.Scanner;

public class LendoDiferentesTiposDeDados {

    public static void main(String[] args) {
        System.out.println("====================");
        Scanner scanner = new Scanner(System.in);
        // ----------------------------------------------
        System.out.print(" >>> Digite um texto: ");
        String texto = scanner.nextLine();
        System.out.println("O texto digitado "
        + "foi: " + texto);
        // ----------------------------------------------
        System.out.print(" >>> Digite um decimal: ");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("O número decimal digitado "
        + "foi " + numeroDecimal);
        // ----------------------------------------------
        System.out.print(" >>> Digite um inteiro: ");
        int numeroInteiro = scanner.nextInt();
        System.out.println("O número inteiro digitado "
        + "foi " + numeroInteiro);
        // ----------------------------------------------
        System.out.print(" >>> Digite um boolean (true ou false): ");
        boolean booleano = scanner.nextBoolean();
        System.out.println("O booleano digitado "
        + "foi " + booleano);
        // ----------------------------------------------
        scanner.close();
        System.out.println("Fim!");
        System.out.println("====================");
    }
    
}
