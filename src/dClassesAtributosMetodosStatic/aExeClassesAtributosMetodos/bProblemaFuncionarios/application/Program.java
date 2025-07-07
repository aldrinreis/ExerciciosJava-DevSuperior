package dClassesAtributosMetodosStatic.aExeClassesAtributosMetodos.bProblemaFuncionarios.application;

import dClassesAtributosMetodosStatic.aExeClassesAtributosMetodos.bProblemaFuncionarios.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Employee empregado = new Employee();
        System.out.print("Nome: ");
        empregado.name = sc.nextLine();
        System.out.print("Salário Bruto: ");
        empregado.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        empregado.imposto =sc.nextDouble();

        System.out.println("Funcionário " + empregado);

        System.out.print("Qual a porcentagem para aumentar o salario? ");
        double percentage = sc.nextDouble();
        empregado.aumentoSalario(percentage);

        System.out.println("Dados Atualizados: " + empregado);

        sc.close();


    }

}
