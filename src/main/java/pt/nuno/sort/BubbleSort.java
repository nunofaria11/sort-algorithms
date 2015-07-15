package pt.nuno.sort;

/**
 * Created by nuno on 15/07/15.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSort<T> {

    public void sort(T[] array) {
        if (array.length < 2) {
            return;
        }
        int k;
        int n = array.length;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i].compareTo(array[k]) > 0) {
                    swap(array, i, k);
                }
            }
        }
    }
}
