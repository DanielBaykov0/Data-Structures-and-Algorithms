public class RadixSort {

    public static void main(String[] args) {

        int[] arr = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(arr, 10, 4);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void radixSort(int[] arr, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(arr, i, radix);
        }
    }

    public static void radixSingleSort(int[] arr, int position, int radix) {

        int numItems = arr.length;
        int[] countArray = new int[radix];

        for (int value : arr) {
            countArray[getDigit(position, value, radix)]++;
        }

        //Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, arr[tempIndex], radix)]] = arr[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            arr[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(10, position) % radix;
    }
}
