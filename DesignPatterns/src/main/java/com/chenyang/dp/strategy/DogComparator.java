package com.chenyang.dp.strategy;

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getFood() > o2.getFood()) return 1;
        if (o1.getFood() < o2.getFood()) return -1;
        return 0;
    }
}
