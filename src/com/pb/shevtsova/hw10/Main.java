package com.pb.shevtsova.hw10;

public class Main {
        public static void main(String[] args) {
            NumBox<Integer> numboxInt = new NumBox<>(10);
            try {
                numboxInt.add(100);
                numboxInt.add(20);
                numboxInt.add(3);
                numboxInt.add(45);
                numboxInt.add(5);
                numboxInt.add(859);
                }
            catch (WrongLengthException e) {
                e.printStackTrace();

            }

            System.out.println("Вывод элемента по индексу Integer " + numboxInt.get(3));

            System.out.println("Tекущее количество элементов Integer " + numboxInt.length());

            System.out.println("Среднее арифметическое значения для Integer " + numboxInt.average());

            System.out.println("Сумма всех элементов массива для Integer " + numboxInt.sum());

            System.out.println("Максимальный элемент для Integer " + numboxInt.max());

            System.out.println("---------------------------------------------------------------");


            NumBox<Float> numboxFloat = new NumBox<>(7);
            try {
                numboxFloat.add((float) 100.55);
                numboxFloat.add((float) 20.58);
                numboxFloat.add((float) 3.33);
                numboxFloat.add(45F);
                numboxFloat.add(5F);
                numboxFloat.add(555859.25F);
            }
            catch (WrongLengthException e) {
                e.printStackTrace();

            }

            System.out.println("Вывод элемента по индексу Float " + numboxFloat.get(5));

            System.out.println("Tекущее количество элементов Float " + numboxFloat.length());

            System.out.println("Среднее арифметическое значения для Float " + numboxFloat.average());

            System.out.println("Сумма всех элементов массива для Integer " + numboxFloat.sum());

            System.out.println("Максимальный элемент для Integer " + numboxFloat.max());

    }
}
