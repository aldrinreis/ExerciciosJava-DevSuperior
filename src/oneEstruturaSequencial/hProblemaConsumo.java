package oneEstruturaSequencial;

/*
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
combustível gasto por este carro ao percorrer tal distância.
Seu programa deve mostrar o consumo médio do carro, com três casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class hProblemaConsumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distancia;
        double consumo, combustivel;

        System.out.print("Distancia percorrida: ");
        distancia = sc.nextInt();
        System.out.print("Combustivel gasto: ");
        combustivel= sc.nextDouble();

        consumo = distancia / combustivel;

        System.out.printf("Consumo= %.3f %n", consumo);

        sc.close();

    }
}
