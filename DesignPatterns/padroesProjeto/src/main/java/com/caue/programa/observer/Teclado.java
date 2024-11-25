package com.caue.programa.observer;

public class Teclado implements Observer{
    private String cor;
    @Override
    public void update(String cor){
        this.cor = cor;
        System.out.println("Cor teclado: " + this.cor);
    }
}
