package cEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;
/*
Escreva um algoritmo que leia um número inteiro N, e depois repita N vezes: ler dois números e
imprimir o resultado da divisão do primeiro pelo segundo.
Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
 */

public class nProblemaDivisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtdeCasos;
        double numerador, denominador, divisao;

        System.out.print("Quantos casos voce vai digitar? ");
        qtdeCasos = sc.nextInt();
        for (int i = 0; i < qtdeCasos; i++){
            System.out.print("Entre com o numerador: ");
            numerador = sc.nextDouble();
            System.out.print("Entre com o denominador: ");
            denominador = sc.nextDouble();

            if(denominador == 0 ){
                System.out.println("DIVISAO IMPOSSIVEL");
            }else {
                divisao = numerador / denominador;
                System.out.printf("DIVISÃO %.2f%n",divisao);
            }
        }

        sc.close();
    }
}
