package If.Else;

import java.util.Scanner;

public class LoginSenha {
    public static void main(String[] args) {
        String loginCerto = "luizmiguel";
        String senhaCerto = "miguel10";

        Scanner l1 = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.println("Digite o seu login: ");
        String login = l1.nextLine();
        
        System.out.println("Digite a sua senha: ");
        String senha = s1.nextLine();

        if (!senhaCerto.equals(senha)||!loginCerto.equals(login)){
            System.out.println("Seu login ou senha estão incorretos.");
        }
        else{
            System.out.println("Login foi feito com sucesso!");
        }
        l1.close();
        s1.close();
    }
}
