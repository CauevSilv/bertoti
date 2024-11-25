package com.caue.programa.strategy;

public class Main {
    public static void main(String[] args) {
        CalculadoraDePreco calculadora = new CalculadoraDePreco();

        double precoOriginal = 100.0;
        
        calculadora.setDescontoStrategy(new Desconto10Porcento());
        System.out.println("Preço com 10% de desconto: " + calculadora.calcularPrecoFinal(precoOriginal));

        calculadora.setDescontoStrategy(new DescontoFixo());
        System.out.println("Preço com desconto fixo: " + calculadora.calcularPrecoFinal(precoOriginal));

        calculadora.setDescontoStrategy(new SemDesconto());
        System.out.println("Preço sem desconto: " + calculadora.calcularPrecoFinal(precoOriginal));
    }
}
