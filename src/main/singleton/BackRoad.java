package main.singleton;

public class BackRoad {

    @Override
    public String toString() {
        boolean canMove = TrafficController.getInstance().isCanMoveBackCars();
        return canMove ? "Дорога сзади едет" : "Дорога сзади стоит";
    }

}
