package com.pb.shevtsova.hw7;

public abstract class Clothes {
     private String name;
    private Size size;
    private Integer cost;
    private String color;

    public Clothes(String name, Size size, Integer cost, String color) {
        this.name = name;
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public Integer getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
