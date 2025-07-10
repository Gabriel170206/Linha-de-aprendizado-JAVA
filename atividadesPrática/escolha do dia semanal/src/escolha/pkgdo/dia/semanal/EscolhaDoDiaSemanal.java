package escolha.pkgdo.dia.semanal;

import java.util.Scanner;

public class EscolhaDoDiaSemanal {

    public static void main(String[] args) {
        Scanner week = new Scanner(System.in);
            System.out.println("Escolha um dia da semana, você pode digitar um digito dentre 0 e 7.");
            int diaSelected = week.nextInt();
        week.close();
        String selectedDayInWeek = "";
        switch  (diaSelected){
            case 1 :  selectedDayInWeek = "Domingo";
                break;
            case 2 :  selectedDayInWeek = "Segunda-Feira";
                break;
            case 3 :  selectedDayInWeek = "Terça-Feira";
                break;
            case 4 :  selectedDayInWeek = "Quarta-Feira";
                break;
            case 5 :  selectedDayInWeek = "Quinta-Feira";
                break;
            case 6 :  selectedDayInWeek = "Sexta-Feira";
                break;
            case 7 :  selectedDayInWeek = "Sábado";
                break;
            default: System.out.println("Só existem sete dias em uma semana, não mais que isso!");
        }
        if("Domingo".equals(selectedDayInWeek) || "Segunda-Feira".equals(selectedDayInWeek) || "Terça-Feira".equals(selectedDayInWeek) || "Quarta-Feira".equals(selectedDayInWeek) || "Quinta-Feira".equals(selectedDayInWeek) || "Sexta-Feira".equals(selectedDayInWeek) || "Sábado".equals(selectedDayInWeek)) {
            System.out.println("sua escolha é "+selectedDayInWeek);   
        }
        else{
            System.out.println(selectedDayInWeek);
        }
    }
    
}
