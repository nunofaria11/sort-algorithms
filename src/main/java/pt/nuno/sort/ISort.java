package pt.nuno.sort;

/**
 * Created by nuno on 15/07/15.
 */
public interface ISort<T extends Comparable<T>> {

    void sort(T[] array);

}
