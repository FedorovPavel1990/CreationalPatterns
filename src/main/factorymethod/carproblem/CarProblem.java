package main.factorymethod.carproblem;

import main.factorymethod.repairman.Repairman;

public abstract class CarProblem {

    protected abstract Repairman getRepairman();

    public void fix() {
        Repairman repairman = getRepairman();
        repairman.repairCar();
    }

}
