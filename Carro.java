package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Carro {
    String cor;
    String placa;
    String modelo;

    public void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a placa");
        this.placa= tc.next();
        //demais dados
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(placa, carro.placa);
    }

    public String mostrar(){
        return this.placa;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                '}';
    }
}
