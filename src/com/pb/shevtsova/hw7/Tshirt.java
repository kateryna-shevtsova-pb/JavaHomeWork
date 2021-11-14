package com.pb.shevtsova.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes
{

    public Tshirt(String name, Size size, Integer cost, String color) {
        super(name, size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("название: "+getName()+", размер: "+getSize()+", цена: "+getCost()+", цвет: "+getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println("название: "+getName()+", размер: "+getSize()+", цена: "+getCost()+", цвет: "+getColor());
    }
}
