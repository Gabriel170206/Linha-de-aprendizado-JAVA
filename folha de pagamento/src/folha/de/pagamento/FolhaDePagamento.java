package folha.de.pagamento;

import java.util.Scanner;

public class FolhaDePagamento {

    public static void main(String[] args) {
        
        Scanner folhaDePagamento = new Scanner(System.in);
            System.out.print("Diga o seu salário por hora trabalhada! ");
                double salarioPorHora = folhaDePagamento.nextDouble();
            System.out.print("Diga a quantia de horas que você trabalha no mês! ");
                double horasTrabalhadasPorMes = folhaDePagamento.nextDouble();
        folhaDePagamento.close();
            double salarioBruto = salarioPorHora * horasTrabalhadasPorMes;
            double FGTS = (11.0/100.0) * salarioBruto;
            double INSS = (10.0/100.0) * salarioBruto;
        System.out.println("Então você ganha um pagamento de (R$ "+salarioPorHora+") por mês e você trabalha ("+horasTrabalhadasPorMes+")horas ao mês, então seu salario bruto é de (R$ "+ salarioBruto+")");
        if(salarioBruto <= 900.0) {
            System.out.println("Como seu salario é  de (R$ "+salarioBruto+")você está isento de impostos!");
        }
        else if(salarioBruto > 900.0 && salarioBruto <= 1500.0) {
                double impostoDeRenda = (5.0/100.0) * salarioBruto;
                double totalDescontos = impostoDeRenda + INSS;
                double salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("Seu salário sofrerá alterações com descontos governamentais como do IR(Imposto de Renda) e INSS(Instituto Nacional do Seguro Social). Vale deixar claro que O FGTS(Fundo de Garantia do Tempo de Serviço) faz parte do seu salário.");
            System.out.println("Logo seu salário bruto era de (R$ "+salarioBruto+"), ressaltando que o FGTS contribui com (R$ "+FGTS+") presente no seu salário .");
            System.out.println("Agora com os descontos do IR de (R$ "+impostoDeRenda+") e com o INSS de (R$ "+INSS+"), o seu salário liquido  será de valor (R$ "+salarioLiquido+")");
        }
        else if(salarioBruto > 1500.0 && salarioBruto <= 2500.0) {
                double impostoDeRenda = (10.0/100.0) * salarioBruto;
                double totalDescontos = impostoDeRenda + INSS;
                double salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("Seu salário sofrerá alterações com descontos governamentais como do IR(Imposto de Renda) e INSS(Instituto Nacional do Seguro Social). Vale deixar claro que O FGTS(Fundo de Garantia do Tempo de Serviço) faz parte do seu salário.");
            System.out.println("Logo seu salário bruto era de (R$ "+salarioBruto+"), ressaltando que o FGTS contribui com (R$ "+FGTS+") presente no seu salário .");
            System.out.println("Agora com os descontos do IR de (R$ "+impostoDeRenda+") e com o INSS de (R$ "+INSS+"), o seu salário liquido  será de valor (R$ "+salarioLiquido+")");
        }
        else {
                double impostoDeRenda = (20.0/100.0) * salarioBruto;
                double totalDescontos = impostoDeRenda + INSS;
                double salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("Seu salário sofrerá alterações com descontos governamentais como do IR(Imposto de Renda) e INSS(Instituto Nacional do Seguro Social). Vale deixar claro que O FGTS(Fundo de Garantia do Tempo de Serviço) faz parte do seu salário.");
            System.out.println("Logo seu salário bruto era de (R$ "+salarioBruto+"), ressaltando que o FGTS contribui com (R$ "+FGTS+") presente no seu salário .");
            System.out.println("Agora com os descontos do IR de (R$ "+impostoDeRenda+") e com o INSS de (R$ "+INSS+"), o seu salário liquido  será de valor (R$ "+salarioLiquido+")");
        }
    }
    
}
