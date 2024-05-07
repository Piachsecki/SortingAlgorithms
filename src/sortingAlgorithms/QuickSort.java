package src.sortingAlgorithms;

public class QuickSort<T extends Comparable> {

    void heap_create_dn(T tab[ ], int len_tab) {
        for(int i = (len_tab-1-1)/2; i>=0; --i)
            heap_fix_down(tab, i, len_tab);
    }



    public void heapSort(T t[ ])
    {
        int n = t.length;
        heap_create_dn(t, n);

        for(int i=n-1;i>0; i--) {
            swap(t, 0, i);	  //zamiana
            heap_fix_down(t,0,i); //naprawa
        }
    }


    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    private void heap_fix_down(T[] arr, int index, int len) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        // Check if left child exists and is greater than the current largest element
        if (leftChild < len && arr[leftChild].compareTo(arr[largest]) > 0) {
            largest = leftChild;
        }

        // Check if right child exists and is greater than the current largest element
        if (rightChild < len && arr[rightChild].compareTo(arr[largest]) > 0) {
            largest = rightChild;
        }

        // If the largest element is not the current index, swap and recursively fix the heap downwards
        if (largest != index) {
            swap(arr, index, largest);
            heap_fix_down(arr, largest, len);
        }
    }



}
