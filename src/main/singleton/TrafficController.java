package main.singleton;

public class TrafficController {

    private static volatile TrafficController instance;

    private boolean canMoveLeftCars = false;
    private boolean canMoveRightCars = false;
    private boolean canMoveFrontCars = false;
    private boolean canMoveBackCars = false;
    private boolean canMovePedestrians = false;

    private TrafficController() {}

    public static TrafficController getInstance() {
        if (instance == null) {
            synchronized (TrafficController.class) {
                if (instance == null ) {
                    instance = new TrafficController();
                }
            }
        }
        return instance;
    }

    public boolean isCanMoveLeftCars() {
        return canMoveLeftCars;
    }

    public boolean isCanMoveRightCars() {
        return canMoveRightCars;
    }

    public boolean isCanMoveFrontCars() {
        return canMoveFrontCars;
    }

    public boolean isCanMoveBackCars() {
        return canMoveBackCars;
    }

    public boolean isCanMovePedestrians() {
        return canMovePedestrians;
    }

    public void allowMoveLeftCars() {
        canMoveLeftCars = true;
        canMoveRightCars = false;
        canMoveFrontCars = false;
        canMoveBackCars = false;
        canMovePedestrians = false;
        System.out.println("Могут двигаться только автмобили слева");
    }

    public void allowMoveRightCars() {
        canMoveLeftCars = false;
        canMoveRightCars = true;
        canMoveFrontCars = false;
        canMoveBackCars = false;
        canMovePedestrians = false;
        System.out.println("Могут двигаться только автмобили справа");
    }

    public void allowMoveFrontCars() {
        canMoveLeftCars = false;
        canMoveRightCars = false;
        canMoveFrontCars = true;
        canMoveBackCars = false;
        canMovePedestrians = false;
        System.out.println("Могут двигаться только автмобили спереди");
    }

    public void allowMoveBackCars() {
        canMoveLeftCars = false;
        canMoveRightCars = false;
        canMoveFrontCars = false;
        canMoveBackCars = true;
        canMovePedestrians = false;
        System.out.println("Могут двигаться только автмобили сзади");
    }

    public void allowMovePedestrians() {
        canMoveLeftCars = false;
        canMoveRightCars = false;
        canMoveFrontCars = false;
        canMoveBackCars = false;
        canMovePedestrians = true;
        System.out.println("Могут двигаться только пешеходы");
    }

}
