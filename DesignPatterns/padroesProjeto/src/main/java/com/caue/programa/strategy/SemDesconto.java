package com.caue.programa.strategy;

public class SemDesconto implements DescontoStrategy {
    @Override
    public double calcularDesconto(double precoOriginal) {
        return precoOriginal; // Retorna o preço original
    }
}
