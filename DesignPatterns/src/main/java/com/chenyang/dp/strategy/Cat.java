package com.chenyang.dp.strategy;

public class Cat {
    private int weight;
    private int height;

    public Cat() {
    }

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat c) {
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
