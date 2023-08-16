package com.itvdn.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable {

    private String model;
    private static int price;
    private static int year;

    public Car() {
    }

    public Car(String model, int price, int year) {
        this.model = model;
        Car.price = price;
        Car.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Car.price = price;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        Car.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                "price='" + price + '\'' +
                "year='" + year + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getModel());
        out.writeInt(getPrice());
        out.writeInt(getYear());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        model = (String) in.readObject();
        price = in.readInt();
        year = in.readInt();
    }
}
