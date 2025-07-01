package Unit5Tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import unit5.unit5_2.*;

public class unit5_2Tests {
    @Test
    public void testGet() {
        MyLinkedListGeneric<String> list = new MyLinkedListGeneric<> ();
        list.add("one");
        list.add("word");
        assertEquals("word", list.get(1));
    }

    @Test
    public void testGetSize() {
        MyLinkedListGeneric<String> list = new MyLinkedListGeneric<> ();
        list.add("one");
        list.add("word");
        assertEquals(2, list.size());
    }

    @Test
    public void testGetError() {
        MyLinkedListGeneric<String> list = new MyLinkedListGeneric<> ();
        list.add("one");
        list.add("word");
        assertThrows(IndexOutOfBoundsException.class, () -> {list.get(2);});
    }

    @Test
    public void testRemove() {
        MyLinkedListGeneric<String> list = new MyLinkedListGeneric<> ();
        list.add("one");
        list.add("word1");
        list.add("word2");
        list.remove(0);
        assertEquals("word1", list.get(0));
    }
}
