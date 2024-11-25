package com.caue.programa.composite;

public class CompositePattern {
    public static void main(String[] args) {
        Composite composite = new Composite("atributo 45");
        Computador pczao = new Computador("Thinkpad");
        composite.add(pczao);
        composite.execute();
        composite.getComponente().get(0).execute();
    }
}
