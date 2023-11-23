package If.Else;

import java.util.Scanner;

public class SomaDois {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner esc = new Scanner(System.in);

        System.out.println("Informe o 1º número: ");
        int num1 = n1.nextInt();

        System.out.println("Informe o 2º número: ");
        int num2 = n2.nextInt();

        System.out.println("Quer somar os números informados?(sim/nao)");
        String escolha = esc.nextLine();

        if (escolha.equals("sim")){
            System.out.println("A soma dos números digitados é igual a " + (num1+num2));
        }
        n1.close();
        n2.close();
        esc.close();
    }
}
