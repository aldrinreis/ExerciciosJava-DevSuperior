package dClassesAtributosMetodosStatic.aExeClassesAtributosMetodos.DProblemaCambio.util;

import java.util.Locale;

public class CurrencyConverter {

    public static double IOF = 0.06;
    public static double valorPago(double valorDolar, double qtdDolar){
            double total = valorDolar * qtdDolar;
            return total + (total * IOF);
    }

}
