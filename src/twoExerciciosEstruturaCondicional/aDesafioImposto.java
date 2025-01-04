package twoExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class aDesafioImposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double rendaSalario, rendaServico, rendaGanhoCapital, gastoMedico, gastoEducacional, salarioMensal, impostoSalario, impostoServico, impostoCapital;
        double impostoBrutoTotal, maximoDedutivel, gastosDedutiveis, abatimento, impostoDevido;

        System.out.print("Renda anual com salário: ");
        rendaSalario = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        rendaServico = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        rendaGanhoCapital = sc.nextDouble();
        System.out.print("Gastos Médicos: ");
        gastoMedico = sc.nextDouble();
        System.out.print("Gastos Educacionais: ");
        gastoEducacional = sc.nextDouble();

        //Calculando Imposto Salário;

        salarioMensal = rendaSalario /12;

        if(salarioMensal > 3000.00 && salarioMensal < 5000.00){
            impostoSalario = rendaSalario * (10.0 / 100);
        } else if (salarioMensal > 5000.00){
            impostoSalario = rendaSalario * (20.0 / 100);
        } else {
            impostoSalario = 0;
        }

        //Calculando Imposto sobre Serviço Usando expressão ternária.

        impostoServico = (rendaServico > 0) ? rendaServico * 0.15 : 0;

        //Calculando Imposto sobre Ganho de Capital Usando expressão ternária.

        impostoCapital = (rendaGanhoCapital > 0) ? rendaGanhoCapital * 0.2 : 0;


        //Calculos gerais impostos e deduções.

        impostoBrutoTotal = impostoSalario + impostoServico + impostoCapital;
        gastosDedutiveis = gastoMedico + gastoEducacional;
        maximoDedutivel = impostoBrutoTotal * 0.3;


        //Calculo abatimento
        if(gastosDedutiveis >= maximoDedutivel){
            abatimento = maximoDedutivel;
        }else{
            abatimento = gastosDedutiveis;
        }

        impostoDevido = impostoBrutoTotal - abatimento;



        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println(" ");
        System.out.println("CONSOLIDADO DE RENDA:");

        System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
        System.out.printf("Imposto sobre Serviços: %.2f%n", impostoServico);
        System.out.printf("Imposto sobre ganho de Capital: %.2f%n", impostoCapital);

        System.out.println(" ");
        System.out.println("DEDUÇÕES");
        System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
        System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);

        System.out.println(" ");
        System.out.println("RESUMO");
        System.out.printf("Imposto bruto total: %.2f%n", impostoBrutoTotal);
        System.out.printf("Abatimento: %.2f%n", abatimento);
        System.out.printf("Imposto Devido: %.2f%n", impostoDevido);

        sc.close();
    }
}
