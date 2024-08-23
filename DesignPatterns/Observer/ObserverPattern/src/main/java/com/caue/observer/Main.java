package com.caue.observer;

public class Main {
    public static void main(String[] args) {
        Pessoa obj = new Pessoa("Caue",22);
        InscritosLista inscritos = new InscritosLista();
        inscritos.inscritos.addFirst(obj);

        Publisher publisher = new Publisher();
        publisher.update(inscritos);


    }
}