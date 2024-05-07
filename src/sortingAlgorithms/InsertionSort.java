package sortingAlgorithms;

public class InsertionSort<T extends Comparable<T>> {
    public void sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T key = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1].compareTo(key) > 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }
    }
}
