package main.singleton;

public class LeftRoad {

    @Override
    public String toString() {
        boolean canMove = TrafficController.getInstance().isCanMoveLeftCars();
        return canMove ? "Дорога слева едет" : "Дорога слева стоит";
    }
}
