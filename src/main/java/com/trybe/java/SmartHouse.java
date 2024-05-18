package com.trybe.java;

/**
 * Classe.
 **/
public class SmartHouse {
    private boolean isLampadaLigada = false;

    public SmartHouse() {
        this.isLampadaLigada = true;
    }

    void ligarLampada() {
        this.isLampadaLigada = true;
    }

    void desligarLampada() {
        this.isLampadaLigada = false;
    }

    boolean isLampadaLigada() {
        return  this.isLampadaLigada;
    }
}
