package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {

    /*
    Crie uma classe carro, que contenha, cor, modelo e placa.
    Usando um array unidimensional de 10 elementos do tipo Carros,
    faça uma classe que simule a ocupação de um estacionamento de carros.
     Considere que a posição do array corresponde ao número da vaga e
     para cada vaga é armazenada a placa do veículo que está estacionado.
     Sua classe deve conter um laço de repetição simulando um menu que controle a entrada e a saída dos veículos com as opções:
     1-Entrada, 2-Saída e 3-Listar situação atual e 4-Encerrar o programa.
     Se o usuário escolher 1, solicite o número da vaga e a placa do veículo;
     e escolher 2, solicite o número da vaga que será liberada e armazene o
     valor branco na posição correspondente ao array; se escolher 3,
     liste a situação atual apresentando em tela todos os elementos do array;
     quando for 4, encerre o laço e o programa. Use métodos para fazer a alocação de carros no vetor.
     */
    public static void main(String[] args) {
        ArrayList<Carro> estacionamento = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        int op=0;
        do{
            System.out.println("Digite opçao 1-Entrada, 2-Saída e 3-Listar situação atual e 4-Encerrar o programa");
            op=tc.nextInt();
            switch (op){
                case 1:{
                    Carro carro = new Carro();
                    carro.ler();
                    estacionamento.add(carro);
                    break;
                }
                case 2:{
                    System.out.println("Digite a placa do carro");
                    Carro car= new Carro();
                    car.placa= tc.next();
                    if (estacionamento.contains(car)){
                        System.out.println("removendo o carro "+estacionamento.indexOf(car));
                        estacionamento.remove(car);
                    }else{
                        System.out.println("Carro ausente");
                    }
                    break;
                }
                case 3:{
                    for (int i=0;i< estacionamento.size();i++){
                        System.out.println(estacionamento.get(i).mostrar());
                    }
                    break;
                }
                case 4:{
                    System.out.println("BYE BYE");
                    break;
                }

            }
        }while (op!=4);
    }
}
