package builder;

import builder.model.House;
import builder.model.Prorab;

import java.util.Scanner;

public class BuilderExampleApp {

    public static void main(String[] args) {

        Prorab vasya = new Prorab();
        Scanner sc = new Scanner(System.in);
        String houseType = sc.next();
        House mySweetHouse = vasya.makeHouse(houseType);
        House oneMoreHouse = mySweetHouse.clone();

        System.out.println("Конец");

    }
}
