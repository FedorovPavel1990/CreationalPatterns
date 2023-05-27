package main.factorymethod.repairman;

public class Mechanic implements Repairman {

    @Override
    public void repairCar() {
        System.out.println("Перебрал подвеску");
    }

}
