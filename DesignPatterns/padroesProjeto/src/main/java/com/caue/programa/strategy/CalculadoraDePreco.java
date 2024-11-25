package com.caue.programa.strategy;

public class CalculadoraDePreco {
    private DescontoStrategy descontoStrategy;

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularPrecoFinal(double precoOriginal) {
        return descontoStrategy.calcularDesconto(precoOriginal);
    }
}
