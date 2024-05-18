package com.trybe.java;

/**
 * Classe.
 **/
public class SmartHouse {
    private boolean isLampadaLigada = false;

    public SmartHouse() {
        this.isLampadaLigada = true;
    }

    public void ligarLampada() {
        this.isLampadaLigada = true;
    }

    public void desligarLampada() {
        this.isLampadaLigada = false;
    }

    public boolean isLampadaLigada() {
        return  this.isLampadaLigada;
    }
}
