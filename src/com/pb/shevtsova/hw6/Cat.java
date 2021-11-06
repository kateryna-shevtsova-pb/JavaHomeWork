package com.pb.shevtsova.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String name;
    private String sound = "мяу";

    public Cat(String name) {
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
        setFood(" рыба ");
        setLocation("в доме");
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(sound, cat.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sound);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
