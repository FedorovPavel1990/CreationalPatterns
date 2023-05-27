package main;

import main.abstractfactory.ProductFactory;
import main.abstractfactory.WoodenProductFactory;
import main.abstractfactory.caretool.CareTool;
import main.abstractfactory.product.Product;
import main.builder.Pizza;
import main.builder.PizzaBuilder;
import main.factorymethod.carproblem.CarBody;
import main.factorymethod.carproblem.CarProblem;
import main.factorymethod.carproblem.Electrics;
import main.factorymethod.carproblem.Suspension;
import main.prototype.DoorKey;
import main.singleton.*;

import java.util.List;
import java.util.Random;

class Application {

    public static void main(String[] args) {
//        testAbstractFactory();
//        testFactoryMethod();
//        testBuilder();
//        testPrototype();
        testSingleton();
    }

    /**
     * Если заменить WoodenProductFactory на MetalProductFactory, то все изделия будут из металла
     */
    private static void testAbstractFactory() {
        ProductFactory factory = new WoodenProductFactory();

        Product chair = factory.createProduct("Стул");
        CareTool chairCareTool = factory.createCareTool("Средство по уходу за стулом");

        System.out.println(chair);
        System.out.println(chairCareTool);
    }

    /**
     * Рандомно выбираем проблему с машиной и чиним ее, метод CarProblem.getRepairman() является фабричным, для каждой
     * проблемы нужен свой ремонтник
     */
    private static void testFactoryMethod() {
        CarProblem carProblem = List.of(new Electrics(), new Suspension(), new CarBody()).get(new Random().nextInt(3));
        System.out.printf("Проблемная часть машины %s%n", carProblem);
        carProblem.fix();
    }

    /**
     * С помощью PizzaBuilder() мы можем сделать пиццу с любой комбинацией состава в одну строку
     */
    private static void testBuilder() {
        Pizza smallPepperoniPizza = new PizzaBuilder(21)
                .withPepperoni()
                .withCheese()
                .withBacon()
                .build();

        System.out.println(smallPepperoniPizza);
    }

    /**
     * Допустим keyProngs - это массив зубьев дверного ключа, а каждое значение - длина зубца, с помощью метода
     * DoorKey.clone() мы можем сделать дубликат ключей
     */
    private static void testPrototype() {
        DoorKey doorKey = new DoorKey(1, 3, 5, 6, 2, 1, 4);
        DoorKey duplicateDoorKey = doorKey.clone();

        System.out.println(duplicateDoorKey);
    }

    /**
     * Допустим есть перекресток с 4 дорогами и пешеходным переходом, движение разрешается регулировщиком только одной
     * дороги, все дороги и пешеходный переход смотрят на состояние синглтона TrafficController
     */
    private static void testSingleton() {
        LeftRoad leftRoad = new LeftRoad();
        RightRoad rightRoad = new RightRoad();
        FrontRoad frontRoad = new FrontRoad();
        BackRoad backRoad = new BackRoad();
        PedestrianCrossing pedestrianCrossing = new PedestrianCrossing();

        TrafficController.getInstance().allowMovePedestrians();

        System.out.println(leftRoad);
        System.out.println(rightRoad);
        System.out.println(frontRoad);
        System.out.println(backRoad);
        System.out.println(pedestrianCrossing);
    }

}