package com.chenyang.dp.iterator.v4;

public class Main {
    public static void main(String[] args) {
        Collection_ list = new LinkedList_();
//        Collection_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add("s" + i);
        }

        Iterator_ iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(((LinkedList_) list).get(i));
//        }

        System.out.println("list数组长度：" + list.size());
    }
}
