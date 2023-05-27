package main.factorymethod.carproblem;

import main.factorymethod.repairman.BodyRepairman;
import main.factorymethod.repairman.Repairman;

public class CarBody extends CarProblem {
    @Override
    protected Repairman getRepairman() {
        return new BodyRepairman();
    }

    @Override
    public String toString() {
        return "Кузов";
    }
}
