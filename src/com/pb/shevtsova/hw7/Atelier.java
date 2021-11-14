package com.pb.shevtsova.hw7;

public class Atelier {
    public static void main(String[] args) {
       Pants pant = new Pants("штаны", Size.L, 100, "red");
       Skirt skirt = new Skirt("юбка", Size.XS, 200, "green");
       Tshirt tshirt = new Tshirt("футболка", Size.S, 300, "black");
       Tie tie = new Tie("бабочка", Size.M, 400, "blue");


        Clothes[] cl = {pant, skirt, tie, tshirt};
        dressMann(cl);
        dressWomann(cl);

    }
    public static void dressMann (Clothes[] clothes){
        System.out.println ("Мужская одежда");
        for (Clothes c : clothes) {
                if (c instanceof ManClothes) {
                    //System.out.println("название: "+c.name+", размер: "+c.size+", цена: "+c.cost+", цвет: "+c.color);
                    ManClothes manCl = (ManClothes) c;
                    manCl.dressMan();
               }
            }
        }

    public static void dressWomann (Clothes[] clothes){
        System.out.println ("Женская одежда");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                WomenClothes womenClothes = (WomenClothes) clothe;
                womenClothes.dressWomen();
            }
        }
    }
    }

