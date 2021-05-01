package com.chenyang.dp.strategy;

public class Cat implements Comparable<Cat> {
    private int weight;
    private int height;

    public Cat() {
    }

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
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
