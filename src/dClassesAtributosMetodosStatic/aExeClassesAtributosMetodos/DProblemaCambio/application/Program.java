package dClassesAtributosMetodosStatic.aExeClassesAtributosMetodos.DProblemaCambio.application;

import dClassesAtributosMetodosStatic.aExeClassesAtributosMetodos.DProblemaCambio.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        double valorDolar, qtdDolar;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual valor do dólar: ");
        valorDolar = sc.nextDouble();

        System.out.print("Quantos Dólares serão comprados: ");
        qtdDolar = sc.nextDouble();

        double valorTotal = CurrencyConverter.valorPago(valorDolar,qtdDolar);

        System.out.printf("Valor a ser pago em reais = %.2f%n", valorTotal);

        sc.close();
    }
}
