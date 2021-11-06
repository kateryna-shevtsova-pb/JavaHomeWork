package com.pb.shevtsova.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String name;
    private String sound = "гав";

    public Dog(String name) {
        this.name=name;
    }

    private String getName() {
        return name;
    }

    @Override
    public void onReception() {
        name=getName();
        System.out.println("К ветеринару записан " +name);
    }

    @Override
    public void makeNoise() {
        System.out.print("Издает звук "+sound);
    }

    @Override
    public void eat() {
        setFood(" мясо и колбаса ");
        setLocation("в деревне");
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(sound, dog.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sound);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
