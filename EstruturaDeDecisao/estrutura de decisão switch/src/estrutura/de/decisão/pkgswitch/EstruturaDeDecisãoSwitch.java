package estrutura.de.decisão.pkgswitch;

import java.util.Scanner;

public class EstruturaDeDecisãoSwitch {

    public static void main(String[] args) {
        System.out.println("No show do milhão você pode escolher 3 portas pra ganhar um premio, escolha 1 das 3  portas com N° inteiros.");
        
        Scanner speakYouOption = new Scanner(System.in);
            int iSelect = speakYouOption.nextInt();
        speakYouOption.close();
        
        String optionSelected = "";
        
        switch(iSelect) {
            case 1: optionSelected = "você ganhou um carro pejout";
                break;
            case 2: optionSelected = "você não ganhou nada!";
                break;
            case 3: optionSelected = "você ganhou um X-box series S with com o jogo Doom Eternal!";
            default: System.out.println("Ue! Só existe 3 opções, escolha dentre 1 a 3.");
        }
        
        if (iSelect == 1 || iSelect == 2 || iSelect == 3){
            System.out.println("Vejamos, como abriu a porta de número "+iSelect+" então "+optionSelected);
        }
        
    }
}
