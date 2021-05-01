package com.chenyang.dp.strategy;

public class Sorter {
    public void sort(Dog[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private void swap(Dog[] arr, int i, int j) {
        Dog temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
