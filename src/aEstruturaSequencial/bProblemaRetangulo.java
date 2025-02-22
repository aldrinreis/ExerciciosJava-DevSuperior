package aEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;


/*
*Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
*da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
 */

public class bProblemaRetangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        System.out.print("Base do retangulo: ");
        base = sc.nextDouble();

        System.out.print("Altura do retangulo: ");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf("AREA = %.4f\n", area);

        perimetro = 2 * (base + altura);

        System.out.printf("PERIMETRO = %.4f\n", perimetro);

        diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("DIAGONAL = %.4f\n", diagonal);

        sc.close();
    }
}
