package com.chenyang.dp.strategy;

public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getHeight() > o2.getHeight()) return 1;
        if (o1.getHeight() < o2.getHeight()) return -1;
        return 0;
    }
}
