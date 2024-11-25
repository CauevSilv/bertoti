package com.caue.programa.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Computador implements Component{
    private String modelo;

    @Override
    public void execute() {
        System.out.println("THINKPAD E14 GFENT2");
    }
}
