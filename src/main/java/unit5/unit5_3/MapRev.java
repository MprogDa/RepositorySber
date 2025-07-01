package unit5.unit5_3;
import java.util.*;

public class MapRev {
    /**
     * Меняет местами ключи и значения в Map
     * @param map исходная Map
     */
    public static <K, V> Map<V, K> reverse(Map<K, V> map){
        Map<V, K> mapR = new HashMap<>();
        for (Map.Entry<K, V> m : map.entrySet()) {
            mapR.put(m.getValue(), m.getKey());
        }
        return mapR;
    }
}
