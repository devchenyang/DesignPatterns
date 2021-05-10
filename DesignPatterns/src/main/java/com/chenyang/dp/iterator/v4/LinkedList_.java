package com.chenyang.dp.iterator.v4;

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

    public Object get(int i) {
        Node_ currNode = head;
        Object o = currNode.o;
        for (int i1 = 0; i1 < i; i1++) {
            currNode = currNode.next;
            o = currNode.o;
        }
        return o;
    }

    private class Node_ {
        private Object o;
        Node_ next;

        public Node_(Object o) {
            this.o = o;
        }
    }

    @Override
    public Iterator_ iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator_ {

        Node_ curNode = head;

        @Override
        public boolean hasNext() {
            return curNode != null;
        }

        @Override
        public Object next() {
            Object object = curNode.o;
            curNode = curNode.next;
            return object;
        }
    }
}
