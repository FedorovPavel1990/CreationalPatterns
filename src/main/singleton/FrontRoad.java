package main.singleton;

public class FrontRoad {

    @Override
    public String toString() {
        boolean canMove = TrafficController.getInstance().isCanMoveFrontCars();
        return canMove ? "Дорога спереди едет" : "Дорога спереди стоит";
    }

}
