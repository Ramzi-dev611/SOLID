package com.directi.training.lsp.exercice_refactored;

public class Pool {
    public void run()
    {
        DuckInterface donaldDuck = new Duck();
        DuckInterface electricDuck = new ElectronicDuck();
        ((ElectronicDuck)electricDuck).turnOn();
        quack(donaldDuck, electricDuck);
        ((ElectronicDuck)electricDuck).turnOff();
        swim(donaldDuck, electricDuck);
    }

    private void quack(DuckInterface... ducks)
    {
        for (DuckInterface duck : ducks) {
            try {
                duck.quack();
            } catch (DuckInterface.DuckInterfaceException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void swim(DuckInterface... ducks)
    {
        for (DuckInterface duck : ducks) {
            try{
                duck.swim();
            } catch (DuckInterface.DuckInterfaceException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
