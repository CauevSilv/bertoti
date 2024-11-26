package com.caue.programa;

import com.caue.programa.composite.Composite;
import com.caue.programa.composite.Computador;
import com.caue.programa.observer.ControladoraMB;
import com.caue.programa.observer.Mouse;
import com.caue.programa.observer.Teclado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Composite composite = new Composite("atributo 45");
        Computador pczao = new Computador("Thinkpad");
        composite.add(pczao);
        composite.execute();
        composite.getComponente().get(0).execute();
        Scanner sc = new Scanner(System.in);

        ControladoraMB controladora = new ControladoraMB();
        controladora.addObserver(new Mouse());
        controladora.addObserver(new Teclado());

        System.out.println("Observer 2?");
        String clicou = sc.nextLine();
        controladora.setCor(clicou);
    }
}