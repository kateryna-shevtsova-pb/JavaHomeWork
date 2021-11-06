package com.pb.shevtsova.hw6;


import java.lang.reflect.Constructor;
import java.util.Arrays;

public class VetСlinic {
    public static void main(String[] args) throws Exception {


        Animal animal1 = new Dog("Дворняга Шарик ");
        Animal animal2 = new Cat("Пушистый кот Мурзик ");
        Animal animal3 = new Horse("Породистый конь Оскар ");
        Animal[] animals = {animal1, animal2, animal3};

       // for (Animal a : animals) {
        //    a.makeNoise();
        //    a.eat();
            //a.treatAnimal1();
        //}

        Veterinarian V = new Veterinarian();


        Class clazz = V.getClass();
        //System.out.println(clazz.getName());
        //System.out.println(Arrays.toString(clazz.getMethods()));

        //Class vetClazz = Class.forName("com.pb.shevtsova.hw6.Veterinarian");
        Class<?> vetClazz = Class.forName("com.pb.shevtsova.hw6.Veterinarian");

        // создание объекта через рефлексию
        Constructor<?> constr = vetClazz.getConstructor();
        Object obj = constr.newInstance();
        if (obj instanceof Veterinarian)
            for (Animal a: animals){
            System.out.println("----------");
            a.onReception();
            a.eat();
            a.makeNoise();
            ((Veterinarian) obj).treatAnimal(a);
            System.out.println("----------");}


    }
}