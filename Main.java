package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Faça um programa no qual o usuários irá digitar uma frase, depois uma palavra que ele deseja substituir na frase
        e uma outra palavra com no máximo 5 caracter que será colocada no local da palavra a ser substituída. Por exemplo, se o usuário digitar:
        "Batatinha quando nasce" e pedir pra substituir "Batatinha" por maçã,  o programa deve mostrar "Maçã"*/

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite frase");
        String frase = teclado.nextLine();
        System.out.println("Digite a palavra a ser subistituida");
        String palavraSubs = teclado.next();
        int tam=0;
        String troca;
        do {
            System.out.println("Digite a palavra");
           troca = teclado.next();
            tam= troca.length();
        }while (tam>5) ;

       String fraseTroca= frase.replaceAll(palavraSubs,troca);

        System.out.println("Frase original " +frase);
        System.out.println("Frase Trocada " +fraseTroca);

    }
}
