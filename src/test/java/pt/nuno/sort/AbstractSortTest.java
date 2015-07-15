package pt.nuno.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import pt.nuno.sort.ISort;

/**
 * Created by nuno on 15/07/15.
 */
@Ignore

public abstract class AbstractSortTest {


    protected ISort sorter;

    abstract ISort getSort();

    public static void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i].toString());
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] array) {
        boolean sorted = true;
        for (int i = 0; i < array.length - 1 && sorted; i++) {
            sorted &= array[i].compareTo(array[i + 1]) < 1;
        }
        return sorted;
    }


    @Before
    public void setup() {
        sorter = getSort();
    }

    @Test
    public void testSort() throws Exception {
        Integer[] array;

        array = new Integer[]{1, 5, 2, 4, 3, 7, 9, 8, 6, 0};
        sorter.sort(array);
        Assert.assertTrue(isSorted(array));

        array = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        sorter.sort(array);
        Assert.assertTrue(isSorted(array));
    }

    @Test
    public void testAlreadySorted() {
        Integer[] array = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        sorter.sort(array);
        Assert.assertTrue("assert already sorted", isSorted(array));
    }

    @Test
    public void testUnder2() {
        Integer[] array;
        array = new Integer[]{};
        sorter.sort(array);
        Assert.assertTrue("assert empty is sorted", isSorted(array));
        array = new Integer[]{1, 1};
        sorter.sort(array);
        Assert.assertTrue("assert already sorted", isSorted(array));
    }


}
