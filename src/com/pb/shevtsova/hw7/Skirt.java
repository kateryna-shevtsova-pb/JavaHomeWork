package com.pb.shevtsova.hw7;

public class Skirt extends Clothes implements WomenClothes
{

    public Skirt(String name, Size size, Integer cost, String color) {
        super(name, size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("название: "+getName()+", размер: "+getSize()+", цена: "+getCost()+", цвет: "+getColor());
    }
}
