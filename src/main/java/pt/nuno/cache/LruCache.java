package pt.nuno.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by nuno on 15/07/15.
 */
public class LruCache<K, V> extends LinkedHashMap<K, V> {

    private int cacheSize;

    public LruCache(int cacheSize) {
        super(cacheSize, 1, true);
        this.cacheSize = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > cacheSize;
    }
}
