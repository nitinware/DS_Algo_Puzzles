package com.java.dsalgopuzzles.arrays.heap;

public class Heap {
    // one-dimensional array representation - Max Heap
    private int[] heap;

    // number of items in the heap
    private int heapSize;

    public Heap() {
        heap = new int[Constants.CAPACITY];
    }

    // O(1)
    public boolean isFull() {
        return heapSize == heap.length;
    }

    // O(1)
    public boolean isEmpty() {
        return heapSize == 0;
    }

    // the max item is the root node (index 0) in a map heap in O(1)
    public int getMax() {
        return heap[0];
    }

    // heapsort is doing a poll() operation for N times O(NlogN)
    public void heapSort() {
        int n = heapSize;
        for (int i = 0; i < n; i++) {
            int max = poll();
            System.out.println(max);
        }
    }

    // that removes and returns the max item in O(logN)
    public int poll() {
        int max = getMax();
        // swap the root node with the last item
        swap(0, heapSize-1);
        heapSize--;

        // fix the heap properties if needed
        fixDown(0);

        return max;
    }

    // O(logN)
    private void fixDown(int index) {
        // left child index = 2*i + 1 and right child index = 2*i + 2
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        // in a max heap the parent is always larger than the children
        int largestIndex = index;
        if (leftChildIndex < heapSize && heap[leftChildIndex] > heap[index])
            largestIndex = leftChildIndex;
        // we compare the right child with the max(parent, left child)
        if (rightChildIndex < heapSize && heap[rightChildIndex] > heap[largestIndex])
            largestIndex = rightChildIndex;

        // one of the children is larger than the parent - so we have to swap the item
        // otherwise the heap properties are not violated
        if (index != largestIndex) {
            swap(index, largestIndex);
            // until the heap properites are violated we keep calling the method recursively
            fixDown(largestIndex);
        }

    }

    public void insert(int data) {
        if (isFull()) throw new RuntimeException("Heap is full...");

        heap[heapSize] = data;
        heapSize++;

        fixUp(heapSize-1);
    }

    private void fixUp(int index) {
        // index of the parent - int parentIndex = (childIndex - 1) /2;
        int parentIndex = (index - 1)/2;

        // in worst-case we have to consider all nodes upto root node (index 0)
        // in a maximum heap the parent is always larger
        if (index > 0 && heap[index] > heap[parentIndex]) {
            swap(index, parentIndex);
            fixUp(parentIndex);
        }
    }

    // O(1)
    public void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

}
