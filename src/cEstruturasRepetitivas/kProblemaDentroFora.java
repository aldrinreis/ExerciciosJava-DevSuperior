package cEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
conforme exemplo
 */
public class kProblemaDentroFora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtdeNum, dentro, fora, numero;

        System.out.print("Quantos números voce vai digitar? ");
        qtdeNum = sc.nextInt();
        dentro = 0;
        fora = 0;

        for(int i=0; i < qtdeNum; i++){
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero < 10 || numero > 20){
                fora++;
            }else {
                dentro++;
            }
        }
        System.out.printf("%d DENTRO\n", dentro);
        System.out.printf("%d FORA\n", fora);


        sc.close();
    }
}
