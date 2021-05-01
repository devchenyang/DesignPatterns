package com.chenyang.dp.strategy;

public class Cat implements Comparable {
    private int weight;
    private int height;

    public Cat() {
    }

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Object o) {
        Cat c = (Cat) o;
        if (this.weight > c.weight) return 1;
        if (this.weight < c.weight) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
