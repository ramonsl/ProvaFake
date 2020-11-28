package com.company;

import java.util.Scanner;

public class Vetores {

    /*
    5.Faça uma classe contendo dois arrays do tipo inteiro,
    um chamado par e outro chamado ímpar.
    O array par deve conter 10 elementos e o impar 20.
     A seguir faça a leitura de valores adicionando números
     pares no vetor par e valores ímpares no vetor ímpar,
     até um dos dois vetores estarem cheios.
     Ao  final, apresente o conteúdo de cada um dos arrays.
     */

    public static void main(String[] args) {
       int par[]= new int[10];
       int impar[]= new int[20];
       int contImpar=0;
       int contPar=0;
        Scanner tc= new Scanner(System.in);
       do{

           System.out.println("Digite o valor=");
           int value=tc.nextInt();
           if(value%2==0){
               System.out.println("Valor adicionado no vetor par, na posição "+contPar);
               par[contPar]=value;
               contPar++;
           }else{
               System.out.println("Valor adicionado no vetor impar, na posição "+contImpar);
               impar[contImpar]=value;
               contImpar++;
           }
       }while (contPar<10&&contImpar<20);


        for (int i=0; i<contImpar;i++){

            System.out.println("Valor :"+impar[i]);
        }
        for (int i=0; i<contPar;i++){
            System.out.println("Valor :"+par[i]);
        }
    }
}
