package cEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Leia 2 valores inteiros X e Y (em qualquer ordem).
 A seguir, calcule e mostre a soma dos números impares entre eles.
 */
public class iProblemaSomaImpares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        int x , y, trocaSeq;
        System.out.println("Digite 2 números: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y){
            trocaSeq = x;
            x = y;
            y = trocaSeq;

        }
        int somaImpar = 0;
        for(int i = x+1; i < y; i++){
            if(i % 2 !=0){
                somaImpar = somaImpar +i;
            }

        }

        System.out.printf("Soma dos Impares: %d%n", somaImpar);

        sc.close();
    }
}
