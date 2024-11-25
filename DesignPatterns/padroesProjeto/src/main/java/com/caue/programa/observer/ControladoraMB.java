package com.caue.programa.observer;

import java.util.ArrayList;
import java.util.List;

public class ControladoraMB {
    private List<Observer> observerList = new ArrayList<Observer>();
    private String cor;
    public void addObserver(Observer observer) { observerList.add(observer); }
    public void removeObserver(Observer observer) { observerList.remove(observer); }
    public void setCor(String cor) { this.cor = cor; }
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(cor);
        }
    }
}
