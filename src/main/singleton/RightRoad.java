package main.singleton;

public class RightRoad {

    @Override
    public String toString() {
        boolean canMove = TrafficController.getInstance().isCanMoveRightCars();
        return canMove ? "Дорога справа едет" : "Дорога справа стоит";
    }
}
