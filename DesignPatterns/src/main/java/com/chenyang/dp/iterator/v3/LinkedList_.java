package com.chenyang.dp.iterator.v3;

public class LinkedList_ implements Collection_ {
    // LinkedList_类同时关联头结点和尾结点
    Node_ head = null;
    Node_ tail = null;

    private int size = 0;

    public void add(Object o) {
        // 添加元素前先把传入的对象封装到一个Node对象里
        // 其实相当于添加了一个node对象
        Node_ node_ = new Node_(o);
        node_.next = null;

        // 添加第一个元素时，把这个元素同时赋给LinkedList的头尾节点
        if (head == null) {
            head = node_;
            tail = node_;
        }

        // 添加非首个元素时，把该元素赋给尾结点的nextNode成员变量，
        // 并把尾节点更新为当前节点
        tail.next = node_;
        tail = node_;
        size++;
    }

    public int size() {
        return size;
    }

    private class Node_ {
        private Object o;
        Node_ next;

        public Node_(Object o) {
            this.o = o;
        }
    }
}
