package com.example.veiculoapplication.veiculos;

public class CarroEsportivo extends Veiculo{
    public CarroEsportivo(String modelo) {
        super(modelo);
    }

    @Override
    public void aumentarVelocidade() {
        velocidade += 4;

        if (velocidade > 120) marcha = 6;
        else if (velocidade > 110) marcha = 5;
        else if (velocidade > 90) marcha = 4;
        else if (velocidade > 60) marcha = 3;
        else if (velocidade > 20) marcha = 2;
        else marcha = 1;

        info();
    }

    @Override
    public void diminuirVelocidade() {
        velocidade -= 3;
        if (velocidade < 0) velocidade = 0;

        if (velocidade < 10) marcha = 1;
        else if (velocidade < 20) marcha = 2;
        else if (velocidade < 40) marcha = 3;
        else if (velocidade < 70) marcha = 4;
        else if (velocidade < 90) marcha = 5;

        info();
    }
}

