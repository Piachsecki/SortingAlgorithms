package sortingAlgorithms;

public class HeapSort<T extends Comparable<T>> {
    public void sort(T[] arr)
    {
        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);
        for (int i = N - 1; i > 0; i--) {
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(T arr[], int N, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < N && arr[l].compareTo(arr[largest]) > 0)
            largest = l;
        if (r < N && arr[r].compareTo(arr[largest]) > 0 )
            largest = r;
        if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, N, largest);
        }
    }
}
