package cEstruturasRepetitivas;

/*Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
indivíduo.
O último dado, que não entrará nos cálculos, contém um valor de idade negativa.
Calcular e imprimir a idade média deste grupo de indivíduos.
Se for entrado um valor negativo na primeira vez, mostrar a mensagem "IMPOSSIVEL CALCULAR".
 */

import java.util.Locale;
import java.util.Scanner;

public class bProblemaMediaIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int idades, contador;
        double soma, media;


        System.out.println("Digite as idades");
        idades = sc.nextInt();

        if (idades < 0){
            System.out.println("IMPOSSIVEL CALCULAR");
        }else {
            soma = 0;
            contador = 0;
            while (idades >= 0 ){
                soma = soma + idades;
                contador++;

                idades = sc.nextInt();
            }

            media = soma / contador;

            System.out.printf("MÉDIA = %.2f%n", media);

        }

        sc.close();
    }
}

