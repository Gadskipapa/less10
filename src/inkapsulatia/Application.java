package inkapsulatia;

import nasledovanie.Cat;

public class Application {

    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.doStep();
        //robot.x = 100500; -- в паблике работало бы
        //robot.y = -123456789;

        robot.doStep();
        robot.doStep();

        Cat cat = new Cat();
        cat.printInfo();
    }
}
