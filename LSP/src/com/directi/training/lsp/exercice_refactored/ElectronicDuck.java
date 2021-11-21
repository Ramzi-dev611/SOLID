package com.directi.training.lsp.exercice_refactored;

public class ElectronicDuck implements DuckInterface{
    private boolean _on = false;


    @Override
    public void quack() throws DuckInterface.DuckInterfaceException{
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new ElectronicDuckException("Can't quack when off");
        }
    }

    @Override
    public void swim() throws DuckInterface.DuckInterfaceException {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new ElectronicDuckException("Can't swim when off");
        }
    }

    public void turnOn(){
        this._on = true;
    }

    public void turnOff(){
        this._on = false;
    }

    class ElectronicDuckException extends DuckInterface.DuckInterfaceException{
        public ElectronicDuckException(String message){
            super(message);
        }
    }
}
