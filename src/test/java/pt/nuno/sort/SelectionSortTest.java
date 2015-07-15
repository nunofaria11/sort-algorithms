package pt.nuno.sort;

/**
 * Created by nuno on 15/07/15.
 */
public class SelectionSortTest extends AbstractSortTest {

    @Override
    ISort getSort() {
        return new SelectionSort();
    }
}