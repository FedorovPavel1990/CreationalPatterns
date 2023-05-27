package main.factorymethod.repairman;

public class Electrician implements Repairman {

    @Override
    public void repairCar() {
        System.out.println("Починил электерику");
    }
}
