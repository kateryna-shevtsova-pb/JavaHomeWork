package com.pb.shevtsova.hw10;

public class NumBox <T extends Number>{

    public int current_l;

    private final T[] numbers;
    //private int size;
    int i = 0;

    //массив из объектов класса T, инициализировать массив в конструкторе
    //конструктор принимающий параметр - максимальную длину массива

//    public NumBox(T[] numbers) {
//        this.numbers = numbers;
//    }

    public NumBox(int size)
    {
        numbers = (T[]) new Number[size];
    }

    //метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
    public void add(T num) throws WrongLengthException {
            if (i < numbers.length) {
            numbers[i] = num;
            i++;
        } else {
            throw new WrongLengthException("Массив переполнен. Лишний элемент" + num);
                }
    }

    //метод T get(int index) возвращающий число по индексу
    public T get(int index) {
        return numbers[index];
    }

    //метод int length(T[] numbers) возвращает текущее количество элементов.
    public int length(){
        int c = 0;
        for(T el: numbers) { if(el != null) c++; }
        return c;
    }

    //метод double average() - подсчет среднего арифметического среди элементов массива
    public double average() {
        double sum = 0.0;
        int j = 0;
        int c=length();
            for (T value : numbers) {
                sum += value.doubleValue();
            j++;
            if (j>=c) break;}
        sum=sum/j;
        return sum;
    }


    //метод double sum() - сумма всех элементов массива.
    double sum(){
        double sum = 0.0;
        int j = 0;
        int c=length();
        for (T value : numbers) {
            sum += value.doubleValue();
            j++;
            if (j>=c) break;}
        return sum;
    }

    // метод T max() - максимальный элемент массива
    public T max() {
        T max = numbers[0];
        double s = 0.0;
        for (int j = 1; j < length(); j++) {
            s = numbers[j].doubleValue();
            if (s > max.doubleValue()) {
                max = numbers[j];
            }
        }
        return max;
    }



    public void set(int index, T number) {
        this.numbers[index] = number;
    }



}
