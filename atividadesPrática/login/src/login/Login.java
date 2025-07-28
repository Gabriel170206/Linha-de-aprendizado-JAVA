package login;

import java.util.Scanner;

public class Login {
/*
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações,
 * além de tudo, faça com o usuário acesse sua conta cadastrada.
 */
    public static void main(String[] args) {
        Scanner loginUser = new Scanner(System.in);
            System.out.println("Bem vindo ao site simples de fulano!");
            System.out.println("Deseja criar um cadastro para este site?");
            String confirmCreateAccount = loginUser.next();     
            if ( "S".equalsIgnoreCase(confirmCreateAccount) || "SIM".equalsIgnoreCase(confirmCreateAccount) ) {
                String UserName = "";   //Nome de Usuário vago
                String UserPassword = "";   //Senha de Usuário vaga
               do while ( ("".equals(UserName) || "".equals(UserPassword) )   ){ //Se o nome ou senha não for preenchida, que repita a estrutura até que sejam.
                    while ( (UserPassword.equals(UserName)) ) { //Se o nome e senha for iguais, que repita a estrutura até q não sejam.
                        System.out.print("Crie um nome de usuário! \nO nome de usuário não pode conter espaços!");
                        UserName = loginUser.next();
                        System.out.print("Crie uma senha! \nA senha não pode conter espaços!");
                        UserPassword = loginUser.next();
                        
                        if(UserPassword.equals(UserName)){
                            System.out.println("A senha não pode ser similar ao nome de usuário! Tente novamente!");
                        }
                        else{System.out.println("Cadastro efetuado!");}
                    }
                }
                System.out.println("Deseja acessar sua conta?");
                String confirmAcessAccount= loginUser.next();
            if ( "S".equalsIgnoreCase(confirmAcessAccount) || "SIM".equalsIgnoreCase(confirmAcessAccount) ) {
                    String loginUserName = "";
                    String loginUserPassword = "";
                   do while(!loginUserName.equals(UserName) || !loginUserPassword.equals(UserPassword) ){
                        System.out.println("Qual seu nome de usuário?");
                        loginUserName= loginUser.next();
                        System.out.println("Qual sua senha?");
                        loginUserPassword= loginUser.next();
                        if(!loginUserName.equals(UserName) && !loginUserPassword.equals(UserPassword)   ){
                            System.out.println("O nome de usuário e/ou senha possui invalidez! Tente novamente!");
                        }
                    }
                    System.out.println("Seja bem vindo(a) usuário "+UserName+"!");
                }
                else{
                    System.out.println("*O usuári retorna pra sua página anterior!*");
                }
            }
            else{System.out.println("*O usuário é levado para uma nova página ou retorna para uma página anterior*");}
        loginUser.close();
    }
    
}
