package com.example.veiculoapplication.veiculos;

public class Caminhao extends Veiculo {
    public Caminhao(String modelo) {
        super(modelo);
    }

    @Override
    public void aumentarVelocidade() {
        velocidade += 2;

        if (velocidade > 70) marcha = 5;
        else if (velocidade > 50) marcha = 4;
        else if (velocidade > 40) marcha = 3;
        else if (velocidade > 15) marcha = 2;
        else marcha = 1;

        info();
    }

    @Override
    public void diminuirVelocidade() {
        velocidade -= 2;
        if (velocidade < 0) velocidade = 0;

        if (velocidade < 10) marcha = 1;
        else if (velocidade < 35) marcha = 2;
        else if (velocidade < 45) marcha = 3;
        else if (velocidade < 60) marcha = 4;

        info();
    }
}

