package dClassesAtributosMetodosStatic.aExeClassesAtributosMetodos.CProblemaAlunos.application;

import dClassesAtributosMetodosStatic.aExeClassesAtributosMetodos.CProblemaAlunos.entities.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Alunos aluno = new Alunos();
        aluno.name = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());

        if(aluno.notaFinal() < 60){
            System.out.println("REPROVADO");
            System.out.printf("FALTARAM %.2f PONTOS %n", aluno.pontosFaltantes());
        }else {
            System.out.println("APROVADO");
        }

        sc.close();
    }
}
