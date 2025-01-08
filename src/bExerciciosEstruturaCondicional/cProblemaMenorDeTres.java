package bExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;


/*
Fazer um programa para ler três números inteiros.
Em seguida, mostrar qual o menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez.
 */

public class cProblemaMenorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.print("Primeiro valor: ");
        valor1 = sc.nextInt();

        System.out.print("Segundo valor: ");
        valor2 = sc.nextInt();

        System.out.print("Terceiro valor: ");
        valor3 = sc.nextInt();

        if(valor1 < valor2 && valor1 < valor3){
            System.out.println("MENOR = " + valor1);
        }else if(valor2 < valor3){
            System.out.println("MENOR = " + valor2);
        }else{
            System.out.println("MENOR = " + valor3);
        }
        sc.close();
    }
}
