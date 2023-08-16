package com.itvdn.simpleserialization;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Species species = new Species("Cat", "Europe");
        Animal animal = new Animal("Barsik", 5, 3, species);
        File f = new File("src/main/java/com/itvdn/simpleserialization/animal.txt");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {

            oos.writeObject(animal);

            animal = (Animal) ois.readObject();
            System.out.println(animal);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
