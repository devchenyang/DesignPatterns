package com.chenyang.dp.iterator.v5;

public class Main {
    public static void main(String[] args) {
        Collection_<String> list = new LinkedList_<String>();
//        Collection_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add("s" + i);
        }

        Iterator_<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(((LinkedList_) list).get(i));
//        }

        System.out.println("list数组长度：" + list.size());
    }
}
