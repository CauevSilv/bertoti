package com.caue.programa.observer;

public class Mouse implements Observer {
    private String cor;
    @Override
    public void update(String cor){
        this.cor = cor;
        System.out.println("Cor" + cor);
    }
}
