public class MainMaxHeap {

    public static void main(String[] args) {

        MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.insert(80);
        maxHeap.insert(75);
        maxHeap.insert(60);
        maxHeap.insert(68);
        maxHeap.insert(55);
        maxHeap.insert(40);
        maxHeap.insert(52);
        maxHeap.insert(67);

        maxHeap.printHeap();

        maxHeap.delete(0);

        maxHeap.printHeap();
    }
}
