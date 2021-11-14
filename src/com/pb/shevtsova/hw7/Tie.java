package com.pb.shevtsova.hw7;

public class Tie extends Clothes implements ManClothes
{

    public Tie(String name, Size size, Integer cost, String color) {
        super(name, size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("название: "+getName()+", размер: "+getSize()+", цена: "+getCost()+", цвет: "+getColor());
    }



}
