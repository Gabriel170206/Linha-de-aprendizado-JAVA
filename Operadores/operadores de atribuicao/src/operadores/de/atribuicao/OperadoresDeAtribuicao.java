/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores.de.atribuicao;

import java.util.Scanner;

public class OperadoresDeAtribuicao {
 
    public static void main(String[] args) {
        
        System.out.println("Joãozinho possui 4 doces,  mas ele quer comprar mais doces.");
        int candyJhon= 4;
        
        System.out.println("Diga quantos doces a mais ele comprou!");
        Scanner whatOffer= new Scanner(System.in);
        int donateCandy = whatOffer.nextInt();
        candyJhon+=donateCandy; 
        System.out.println("Então Joãozinho possui um total de "+candyJhon+" doces agora.");
        

        System.out.println("IMprevisto. Apareceu um ladrão pra roubar os doces de jaum");
        System.out.println("Diga quantos doces ele roubou de jaum!");
        int thiefCandy = whatOffer.nextInt();
        candyJhon-=thiefCandy; 
        System.out.println("Então Joãozinho possui um total de "+candyJhon+" doces agora.");
        whatOffer.close();
        
    }
    
}
