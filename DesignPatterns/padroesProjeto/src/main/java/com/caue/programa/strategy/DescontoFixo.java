package com.caue.programa.strategy;

public class DescontoFixo implements DescontoStrategy {
    @Override
    public double calcularDesconto(double precoOriginal) {
        return precoOriginal - 20.0; // Reduz R$20
    }
}
