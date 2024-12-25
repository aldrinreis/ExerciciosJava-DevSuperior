package oneEstruturaSequencial;


import java.util.Locale;
import java.util.Scanner;

/*
* Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
* O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente).
* Seu programa deve mostrar o valor do troco a ser devolvido ao cliente.
*
 */
public class eProblemaTroco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnitario, valorTotal, valorRecebido, troco;
        int quantidade;

        System.out.print("Preço unitário do produto: ");
        precoUnitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        System.out.print("Dinheiro Recebido: ");
        valorRecebido = sc.nextDouble();

        valorTotal = precoUnitario * quantidade;

        troco = valorRecebido - valorTotal;

        System.out.printf("TROCO = %.2f%n", troco);

        sc.close();
    }
}
