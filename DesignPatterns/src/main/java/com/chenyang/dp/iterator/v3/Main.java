package com.chenyang.dp.iterator.v3;

public class Main {
    public static void main(String[] args) {
//        Collection_ list = new LinkedList_();
        Collection_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add("s" + i);
        }

        System.out.println("list数组长度：" + list.size());
    }
}
