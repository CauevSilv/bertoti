package com.caue.programa.observer;

import java.util.Scanner;

public class ObserverPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ControladoraMB controladora = new ControladoraMB();
        controladora.addObserver(new Mouse());
        controladora.addObserver(new Teclado());

        System.out.println("Clicou?");
        String clicou = sc.nextLine();
        controladora.setCor(clicou);
    }
}
