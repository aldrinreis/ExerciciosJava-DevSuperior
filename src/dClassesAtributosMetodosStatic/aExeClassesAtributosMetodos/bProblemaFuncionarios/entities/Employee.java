package dClassesAtributosMetodosStatic.aExeClassesAtributosMetodos.bProblemaFuncionarios.entities;

public class Employee {
    public String name;
    public double salarioBruto;
    public double imposto;

    public double proximoSalario(){
        return salarioBruto - imposto;
    }

    public void aumentoSalario(double percentagem){
             salarioBruto   = salarioBruto + (salarioBruto * percentagem / 100);
    }

    public String toString(){
        return "Funcionario: " + name + " , $" + String.format("%.2f", proximoSalario());
    }

}
