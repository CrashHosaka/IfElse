package If.Else;

import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        Scanner verIdade = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        int idade = verIdade.nextInt();

        if (idade>=18) {
            System.out.println("Você tem 18 anos ou mais.");
        }else{
            System.out.println("Você ainda é menor de idade.");
        }

        verIdade.close();
    }
}
