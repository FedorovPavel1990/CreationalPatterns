package main.factorymethod.repairman;

public class BodyRepairman implements Repairman {
    @Override
    public void repairCar() {
        System.out.println("Покрасил крыло");
    }
}
