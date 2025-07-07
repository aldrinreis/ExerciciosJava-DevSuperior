package dClassesAtributosMetodosStatic.aExeClassesAtributosMetodos.a1ProblemaRetangulo.application;
import dClassesAtributosMetodosStatic.aExeClassesAtributosMetodos.a1ProblemaRetangulo.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo;
        retangulo = new Rectangle();

        System.out.println("Entre com a Largura e Altura do Retangulo");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETRO = %.2f$%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

        sc.close();
    }
}
