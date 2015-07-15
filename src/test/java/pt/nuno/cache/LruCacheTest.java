package pt.nuno.cache;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nuno on 15/07/15.
 */
public class LruCacheTest {

    @Test
    public void test() {
        LruCache<String, String> cache = new LruCache<String, String>(3);
        cache.put("a", "1");
        cache.put("b", "2");
        cache.put("c", "3");
        cache.put("d", "4");
        Assert.assertFalse("eldest element removed", cache.containsKey("a"));
    }
}