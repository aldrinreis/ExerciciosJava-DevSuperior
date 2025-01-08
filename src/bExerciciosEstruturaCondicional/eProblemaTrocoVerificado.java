package bExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o
valor restante conforme exemplo.
 */

public class eProblemaTrocoVerificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco, dinheiro, troco, faltam;
        int qtde;

        System.out.print("Preço unitário do produto: ");
        preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        qtde = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        dinheiro = sc.nextDouble();


        if(qtde * preco < dinheiro){
            troco = dinheiro - (preco * qtde);
            System.out.printf("TROCO = %.2f%n", troco);
        }else{
            faltam = (preco * qtde) - dinheiro;

            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS %n", faltam);
        }




        sc.close();
    }
}
