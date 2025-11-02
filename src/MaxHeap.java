public class MaxHeap {
    int[] heap;

    MaxHeap(int[] heap) {
        this.heap = heap;
    }

    void insert(int value) {
        this.heap[heap.length - 1] = value;
        this.heapify();
    }

    void heapify(){

    }

    int pop(){
        var val = this.heap[0];
        this.heap[0] = this.heap[this.heap.length - 1];

        this.heapify();
        return val;
    }

    void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

}
