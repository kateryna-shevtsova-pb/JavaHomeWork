package com.pb.shevtsova.hw6;


public class Animal {
    private String food;
    private String location;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("издает звук");
    }

    public void eat() {
        System.out.println("любимое блюдо "+getFood());
    }

    public void sleep() {
        System.out.println("спит");
    }

    public void onReception() {
        String name="животное";
        System.out.println("К ветеринару записан" +name);
    }

    public static void treatAnimal1(Animal... animals) {
        for (Animal a: animals) {
            System.out.println("Это животное ест " + a.getFood() + " и обитает в " + a.getLocation());
        }
    }

}
