package dClassesAtributosMetodosStatic.aExeClassesAtributosMetodos.a1ProblemaRetangulo.entities;

public class Rectangle {
    public double largura;
    public double altura;


    public double area(){
        return largura * altura;
    }

    public double perimetro(){
        return 2 * (largura * altura);
    }

    public double diagonal(){
        return Math.sqrt(largura * largura + altura * altura);
    }

}
