package varandconstjava;

public class VarAndConstJava {

    public static void main(String[] args) {
        
        //Ret significa retangulo, termo que usei para definir um nome da variável.
        int comprimentoDoRet = 7;
        int larguraDoRet = 4;
        int areaDoRet = comprimentoDoRet * larguraDoRet;
        char letterGabrielG = 'G';
        final String nomeDoFulano = "Gabriel Rodrigues Alves Miranda";
        
        System.out.println("Ccomprimento do retangulo é de ("+comprimentoDoRet+ "m²) e sua largura é de ("+larguraDoRet+ "m²), a área de um retangulo é de: ("+areaDoRet+ "m²)!");   
        System.out.println("O nome "+nomeDoFulano+" começa com a letra "+letterGabrielG+" do alfabeto!");
        
    }
    
}
/*
*[Considerações finais]
* O algoritmo cumpre com a função de calcular a área de um retangulo, cujo as medidas necessária são a largura e comprimento. 
* -Algoritmo simples de Valores pré definidos.
* -Uso de definição de tipagem de variável.
*/
