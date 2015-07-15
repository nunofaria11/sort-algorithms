package pt.nuno.sort;

/**
 * Created by nuno on 15/07/15.
 */
public abstract class AbstractSort<T extends Comparable<T>> implements ISort<T> {

    protected void swap(T[] array, int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
