package com.caue.observer;

import java.util.ArrayList;

public class Publisher implements Inscrito{

    @Override
    public void update(InscritosLista lista) {
        ArrayList<Pessoa> pessoas = lista.inscritos;
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " é corno 1");
        }
    }
}
