package Unit5Tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import unit5.unit5_1.*;

public class Unit5_1Tests {

    @Test
    public void testGet() {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        assertEquals(2, list.get(1));
    }

    @Test
    public void testGetError() {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        assertThrows(IndexOutOfBoundsException.class, () -> {list.get(2);});
    }

    @Test
    public void testClear() {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.clear();
        assertThrows(IndexOutOfBoundsException.class, () -> {list.get(0);});
    }

    @Test
    public void testToString() {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add("2");
        assertEquals("[ 5, 2 ]", list.toString());
    }

}
