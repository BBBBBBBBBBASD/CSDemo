package com.demo;

import java.util.Observable;

public class PanelObservable extends Observable {
    @Override
    public void notifyObservers(Object arg) {
        this.setChanged();
        super.notifyObservers(arg);
    }
}
