package aEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/*

Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
números.

 */


public class dProblemaSoma {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        System.out.print("Insira o valor de X: ");
        x = sc.nextInt();

        System.out.print("Insira o valor de Y: ");
        y = sc.nextInt();

        soma = x + y;

        System.out.println("SOMA = " + soma);


        sc.close();
    }
}
