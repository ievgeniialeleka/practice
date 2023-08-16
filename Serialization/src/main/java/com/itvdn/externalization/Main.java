package com.itvdn.externalization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 50000, 2021);

        File f = new File("src/main/java/com/itvdn/externalization/car.txt");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {

            oos.writeObject(car);
            car = (Car) ois.readObject();
            System.out.println(car);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
