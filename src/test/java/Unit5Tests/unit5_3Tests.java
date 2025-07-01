package Unit5Tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import java.util.*;

import unit5.unit5_3.*;


public class unit5_3Tests {
    @Test
    public void testGet() {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "two");
        Map<String, Integer> rever = MapRev.reverse(m);
        assertEquals((Integer)1, rever.get("two"));

    }

    @Test
    public void testGetTwo() {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "two");
        m.put(2, "one");
        Map<String, Integer> rever = MapRev.reverse(m);
        assertEquals((Integer)2, rever.get("one"));

    }
}
