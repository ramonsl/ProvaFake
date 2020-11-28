package com.company;

public class Matematica {
    /*
 Crie uma classe "Matemática", nela constar os seguintes métodos
um método que soma dois números, e retorna o resultado
um método que soma três números, e retorna o resultado
um método que efetua a subtração de dois valores , e retorna o resultado
O método que exibe o resultado da expressão "a-b+y+z", no qual esses valores serão passados por parâmetros.
Um método que eleve um número a x, onde o número e x são passadas por parâmetro, retornando o valor.
     */
    public int soma(int a, int b){
        return a+b;
    }
    public int soma(int a, int b, int c){
        return a+b+c;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public void expressao(int a, int b, int c, int d){
        System.out.println(a-b+c+d);
    }
    public double  potencia( int n, int x){
      return   Math.pow(n,x);
    }
}
