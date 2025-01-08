package cEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class aDesafioAtletas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtdAtletas;
        String nome, atletaMaisAlto = "";
        char sexo;
        double altura, alturaMediaMulheres,alturaTotalMulheres, percentualHomens;
        alturaTotalMulheres = 0;

        int contadorMulheres, contadorHomens;
        contadorMulheres = 0;
        contadorHomens = 0;

        double pesoTotal, peso, pesoMedio, maiorAltura;

        pesoTotal= 0;
        maiorAltura = 0;

        System.out.print("Qual a quantidade de atletas? ");
        qtdAtletas = sc.nextInt();

        for (int i=1; i <= qtdAtletas; i++){

            System.out.printf("Digite os dados do atleta numero %d%n", i);
            System.out.print("Nome: ");
            sc.nextLine();
            nome=sc.nextLine();

            //Coleta E Validação do Sexo
            System.out.print("Sexo: (F ou M) ");
            sexo = sc.next().charAt(0);
            while (sexo != 'F' && sexo != 'M'){
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                sexo = sc.next().charAt(0);
            }

            //Coleta e Validação Altura e Peso
            System.out.print("Altura: ");
            altura = sc.nextDouble();

            while (altura <=0){
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }

            System.out.print("Peso: ");
            peso = sc.nextDouble();

            while (peso <=0){
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }

            //Obtendo Peso Médio

            pesoTotal = pesoTotal + peso;



            //Obtendo Aleta mais alto
            if (altura > maiorAltura){
                maiorAltura = altura;

                atletaMaisAlto = nome;
                //System.out.println("ATLETA MAIS ALTO"+ atletaMaisAlto);

            }

            //Obtendo percentual de Homens;

            if (sexo == 'M'){
                contadorHomens++;

            }else {
                contadorMulheres++;
                alturaTotalMulheres = alturaTotalMulheres + altura;
            }



        }

        //Validações Finais e Montagem do Relatório
        percentualHomens = (double) contadorHomens / qtdAtletas * 100.0;

        pesoMedio = pesoTotal / qtdAtletas;

        System.out.println("RELATÓRIO");
        System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
        System.out.printf("Atleta mais alto: %s%n",atletaMaisAlto);
        System.out.printf("Porcentagem de homens: %.1f %%%n",percentualHomens);
        if (contadorMulheres == 0){
            System.out.println("Não há mulheres cadastradas");
        }else {
            alturaMediaMulheres = alturaTotalMulheres / contadorMulheres;
            System.out.printf("Altura média das mulheres: %.2f%n",alturaMediaMulheres);
        }

        sc.close();
    }
}
