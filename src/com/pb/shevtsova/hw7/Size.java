package com.pb.shevtsova.hw7;

public enum Size {

    XXS("Детский размер",32),
    XS("Взрослый размер",34),
    S("Взрослый размер",36),
    M("Взрослый размер",38),
    L("Взрослый размер",40);

    private String description;
    private Integer eurosize;

    Size(String description, int eurosize) {
        this.description = description;
        this.eurosize = eurosize;
    }


    @Override
    public String toString() {
        return "Описание: " +description+", евро размер: "+eurosize;
    }

    String getDescription() {
        Size size;
        size = Size.XXS;
        String description = "";
        switch (size) {
            case XXS:{
                System.out.println("Детский размер");
                description="Детский размер";}
                break;
            //case XS,S,M,L: {
            case XS:
            case S:
            case M:
            case L:
            {
                System.out.println("Взрослый размер");
                description="Взрослый размер";}
                break;
            }
        return description;
    }

    Byte getEuroSize() {
        Size size;
        size = Size.XXS;
        Byte eurosize = 32;
        switch (size) {
            case XXS:{
                System.out.println("32");
                eurosize=32;}
                break;
            case XS:{
                System.out.println("34");
                eurosize=34;}
                break;
            case S:{
                System.out.println("36");
                eurosize=36;}
            break;
            case M:{
                System.out.println("38");
                eurosize=38;}
            break;
            case L:{
                System.out.println("40");
                eurosize=40;}
            break;
        }
        return eurosize;
    }


}
