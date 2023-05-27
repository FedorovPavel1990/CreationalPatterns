package main.factorymethod.carproblem;

import main.factorymethod.repairman.Mechanic;
import main.factorymethod.repairman.Repairman;

public class Suspension extends CarProblem {

    @Override
    protected Repairman getRepairman() {
        return new Mechanic();
    }

    @Override
    public String toString() {
        return "Подвеска";
    }

}
