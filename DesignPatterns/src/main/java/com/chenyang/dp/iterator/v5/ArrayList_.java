package com.chenyang.dp.iterator.v5;

public class ArrayList_<E> implements Collection_<E> {
    E[] objects = (E[]) new Object[10];
    private int index = 0;

    public void add(E o) {
        if (index == objects.length) {
            E[] newObjects = (E[]) new Object[this.objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }

        objects[index] = o;
        index ++;
    }

    public int size() {
        return index;
    }

    public E get(int i) {
        return objects[i];
    }

    @Override
    public Iterator_<E> iterator() {
        return new ArrayListIterator<E>();
    }

    private class ArrayListIterator<E> implements Iterator_<E> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }

        @Override
        public E next() {
            E o = (E) objects[currentIndex];
            currentIndex++;
            return o;
        }
    }
}
