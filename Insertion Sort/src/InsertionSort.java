public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        recursiveInsertionSort(arr, arr.length);
//        for (int i = 1; i < arr.length; i++) {
//            int newElement = arr[i];
//
//            int j;
//            for (j = i; j > 0 && arr[j - 1] > newElement; j--) {
//                arr[j] = arr[j - 1];
//            }
//
//            arr[j] = newElement;
//        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void recursiveInsertionSort(int[] arr, int numItems) {

        if (numItems < 2) {
            return;
        }

        recursiveInsertionSort(arr, numItems - 1);

        int newElement = arr[numItems - 1];

        int i;
        for (i = numItems - 1; i > 0 && arr[i - 1] > newElement; i--) {
            arr[i] = arr[i - 1];
        }

        arr[i] = newElement;

        System.out.println("Result of call when numItems = " + numItems);
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
    }
}
