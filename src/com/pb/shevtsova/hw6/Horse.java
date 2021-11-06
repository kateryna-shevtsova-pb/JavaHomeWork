package com.pb.shevtsova.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private String name;
    private String sound = "ржание";

    public Horse(String name) {
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
        System.out.println("Издает звук "+sound);
    }
    @Override
    public void eat() {
        setFood("овес и трава ");
        setLocation("в поле");
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(name, horse.name) && Objects.equals(sound, horse.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sound);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
