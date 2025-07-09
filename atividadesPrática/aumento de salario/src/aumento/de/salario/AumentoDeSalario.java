
package aumento.de.salario;

import java.util.Scanner;

public class AumentoDeSalario {
    /**
     * As Organizações Tabajara resolveram dar um aumento de salário aos seuscolaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
     * Faça um programa que recebe o salário de um colaborador.
     */
    public static void main(String[] args) {
        //O uso de "worker" nas variáveis significa trabalhador.
        Scanner salarioDeWorker = new Scanner(System.in);
            System.out.println("Você sendo como um dos organizadores de uma empresa, decidirá o salário de um dos seus funcionários que receberá um aumento. Diga qual o salário de seu funcionário!");
            double salarioBrutoDeWorker = salarioDeWorker.nextDouble();
        salarioDeWorker.close();
        
        if (salarioBrutoDeWorker <= 280) {
            double percentualSalarioAte280 = 20.0/100.0;
            double aumentoSalarioAte280= (salarioBrutoDeWorker * percentualSalarioAte280);
            double novoSalarioLiquidoAte280= (salarioBrutoDeWorker + aumentoSalarioAte280);
            System.out.println("O salário bruto era de (R$ "+salarioBrutoDeWorker+"), porém com o aumento de percentual de (R$ "+percentualSalarioAte280+"), com o valor do aumento de  (R$ "+aumentoSalarioAte280+"). O novo salário é de (R$ "+novoSalarioLiquidoAte280+") ");
        }
        else if (salarioBrutoDeWorker > 280 && salarioBrutoDeWorker <= 700) {
            double percentualSalarioAte700 = 15.0/100.0;
            double aumentoSalarioAte700= (salarioBrutoDeWorker * percentualSalarioAte700);
            double novoSalarioLiquidoAte700= (salarioBrutoDeWorker + aumentoSalarioAte700);
            System.out.println("O salário bruto era de (R$ "+salarioBrutoDeWorker+"), porém com o aumento de percentual de (R$ "+percentualSalarioAte700+"), com o valor do aumento de  (R$ "+aumentoSalarioAte700+"). O novo salário é de (R$ "+novoSalarioLiquidoAte700+") ");
        }
        else if (salarioBrutoDeWorker > 700 && salarioBrutoDeWorker <= 1500) {
            double percentualSalarioAte1500 = 10.0/100.0;
            double aumentoSalarioAte1500= (salarioBrutoDeWorker * percentualSalarioAte1500);
            double novoSalarioLiquidoAte1500= (salarioBrutoDeWorker + aumentoSalarioAte1500);
            System.out.println("O salário bruto era de (R$ "+salarioBrutoDeWorker+"), porém com o aumento de percentual de (R$ "+percentualSalarioAte1500+"), com o valor do aumento de  (R$ "+aumentoSalarioAte1500+"). O novo salário é de (R$ "+novoSalarioLiquidoAte1500+") ");
        }
        else if (salarioBrutoDeWorker > 1500) {
            double percentualSalarioAteMaior = 5.0/100.0;
            double aumentoSalarioAteMaior= (salarioBrutoDeWorker * percentualSalarioAteMaior);
            double novoSalarioLiquidoAteMaior= (salarioBrutoDeWorker + aumentoSalarioAteMaior);
            System.out.println("O salário bruto era de (R$ "+salarioBrutoDeWorker+"), porém com o aumento de percentual de (R$ "+percentualSalarioAteMaior+"), com o valor do aumento de  (R$ "+aumentoSalarioAteMaior+"). O novo salário é de (R$ "+novoSalarioLiquidoAteMaior+") ");
        }
       
        
    }
    
}
