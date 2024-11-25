package com.caue.programa.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Composite implements Component{
    private final String atributo;
    private List<Component> componente = new ArrayList<Component>();

    public  void add(Component comp){
        componente.add(comp);
    }

    @Override
    public void execute() {
        System.out.println("Executando COMPOSITE");
    }
}
