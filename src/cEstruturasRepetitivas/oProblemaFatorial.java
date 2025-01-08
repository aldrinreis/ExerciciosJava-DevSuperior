package cEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
fatorial de N.
 */

public class oProblemaFatorial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, fatorial;
        System.out.print("Digite o valor de N(Natural < 15): ");
        numero = sc.nextInt();
        fatorial = 1;

        for (int i = numero; i > 0 ; i--){
            fatorial = fatorial * i;
        }

        System.out.printf("FATORIAL = %d\n", fatorial);



        sc.close();

    }
}
