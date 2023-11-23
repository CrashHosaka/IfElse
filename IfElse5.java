package If.Else;

import java.util.Scanner;

public class IfElse5 {
    public static void main(String[] args) {
        Scanner altInf = new Scanner(System.in);
        System.out.println("Tamanho máximo do pacote: 60m³.");
        System.out.println("Largura do pacote: 3 metros.");
        System.out.println("Comprimento do pacote: 2 metros.");
        System.out.println("Informe a altura do pacote em metros: ");
        float alt = altInf.nextFloat();

        if (alt>10){
            System.out.println("A altura informada excederá o tamanho máximo do pacote.");
        }
        else{
            System.out.println("O pacote terá um tamanho de "+ (2*3*alt) +"m³.");
        }
        altInf.close();
    }
}
