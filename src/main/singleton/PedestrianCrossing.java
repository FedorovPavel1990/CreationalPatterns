package main.singleton;

public class PedestrianCrossing {

    @Override
    public String toString() {
        boolean canMove = TrafficController.getInstance().isCanMovePedestrians();
        return canMove ? "Пешеходы идут" : "Пешеходы стоят";
    }

}
