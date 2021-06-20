package com.java.dsalgopuzzles.arrays.heap;

public class HeapApp {

    public static void main(String[] args) {
        Heap heap = new Heap();
        for (int i = 0; i < 10000; i++) {
            heap.insert(i);
        }

        System.out.println("Heap Sort::");
        heap.heapSort();
    }

}
