package sortingAlgorithms;

public class ShellSort<T extends Comparable<T>> {
    public void sort(T[] arrayToSort) {
        int n = arrayToSort.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                T key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap].compareTo(key)>0) {
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
    }
}
