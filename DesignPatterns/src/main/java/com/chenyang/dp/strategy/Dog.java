package com.chenyang.dp.strategy;

public class Dog implements Comparable<Dog> {
    private int food;

    public Dog() {
    }

    public Dog(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog d) {
        if (this.food > d.food) return 1;
        if (this.food < d.food) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
