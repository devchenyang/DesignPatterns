package com.chenyang.dp.iterator.v2;

public class Main {
    public static void main(String[] args) {
        LinkedList_ list = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            list.add("s" + i);
        }

        System.out.println("list数组长度：" + list.size());
    }
}
