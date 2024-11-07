package com.example.veiculoapplication.veiculos;

public abstract class Veiculo {
    protected float velocidade;
    protected int marcha;
    protected String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
        this.marcha = 1;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void info() {
        System.out.println("Modelo: " + modelo + ", Velocidade: " + velocidade + " km/h, Marcha: " + marcha);
    }

    public abstract void aumentarVelocidade();

    public abstract void diminuirVelocidade();
}
