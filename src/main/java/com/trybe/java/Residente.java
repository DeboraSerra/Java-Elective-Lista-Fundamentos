package com.trybe.java;

/**
 * Classe.
 **/
public class Residente {
    public String nome;
    public int idade;
    public double peso;
    public  double altura;

    public  Residente(String nome, int idade, double peso, double altura) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
    }

    public double calculaImc() {
        return this.peso / (this.altura * this.altura);
    }
}
