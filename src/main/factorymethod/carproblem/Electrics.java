package main.factorymethod.carproblem;

import main.factorymethod.repairman.Electrician;
import main.factorymethod.repairman.Repairman;

public class Electrics extends CarProblem {
    @Override
    protected Repairman getRepairman() {
        return new Electrician();
    }

    @Override
    public String toString() {
        return "Электрика";
    }
}
