package com.caue.programa.strategy;

public class Desconto10Porcento implements DescontoStrategy {
    @Override
    public double calcularDesconto(double precoOriginal) {
        return precoOriginal * 0.90; // Aplica 10% de desconto
    }
}

