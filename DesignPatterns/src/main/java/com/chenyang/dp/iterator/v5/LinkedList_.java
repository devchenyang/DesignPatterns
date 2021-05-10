package com.chenyang.dp.iterator.v5;

public class LinkedList_<E> implements Collection_<E> {
    // LinkedList_类同时关联头结点和尾结点
    Node_<E> head = null;
    Node_<E> tail = null;

    private int size = 0;

    public void add(E o) {
        // 添加元素前先把传入的对象封装到一个Node对象里
        // 其实相当于添加了一个node对象
        Node_<E> node_ = new Node_<E>(o);
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

    public E get(int i) {
        Node_<E> currNode = head;
        E o = currNode.o;
        for (int i1 = 0; i1 < i; i1++) {
            currNode = currNode.next;
            o = currNode.o;
        }
        return o;
    }

    private class Node_<T> {
        private T o;
        Node_<T> next;

        public Node_(T o) {
            this.o = o;
        }
    }

    @Override
    public Iterator_<E> iterator() {
        return new LinkedListIterator<E>();
    }

    private class LinkedListIterator<E> implements Iterator_<E> {

        Node_<E> curNode = (Node_<E>) head;

        @Override
        public boolean hasNext() {
            return curNode != null;
        }

        @Override
        public E next() {
            E object = curNode.o;
            curNode = curNode.next;
            return object;
        }
    }
}
