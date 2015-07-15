package pt.nuno.sort;

import java.util.LinkedHashMap;

/**
 * Created by nuno on 15/07/15.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSort<T> {

    public void sort(T[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[index]) < 0) {
                    index = j;
                }
            }
            swap(array, i, index);
            LinkedHashMap<String, String> l = new LinkedHashMap<String, String>();

        }
    }
}
