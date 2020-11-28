package com.company;

import java.util.Scanner;

public class Vetor {
  /*  4- Faça um programa que leia 10 números e adicione a um vetor,
   Utilizando o método Math.max, não permita que valores menores que o
   valor anterior sejam adicionados ao vetor
   */
  public static void main(String[] args) {
        int[] vetor = new int[10];
      Scanner tc = new Scanner(System.in);
      int leia;
      for(int i=0;i<vetor.length;i++){
          System.out.println("digite o valor da posição "+i);
          leia= tc.nextInt();
          if(i==0){
              vetor[i]=leia;
          }else {
              int val;
              val=Math.max(vetor[i-1], leia);
                  while (val<=vetor[i-1]){
                      System.out.println("digite o valor maior que "+vetor[i-1]);
                      leia= tc.nextInt();
                      val=Math.max(vetor[i-1], leia);
                  }
                  vetor[i]=val;
              }
      }
      for (int i=0;i<vetor.length;i++){
          System.out.println(vetor[i]);
      }

      }


}
