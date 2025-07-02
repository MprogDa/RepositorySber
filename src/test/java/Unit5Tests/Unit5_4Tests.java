package Unit5Tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import unit5.unit5_4.*;

public class Unit5_4Tests {
    @Test
    public void testString() {
        String str = TextCount.count("./src/main/java/unit5/unit5_4/textTest.txt");
        assertEquals("Результат (по убыванию):\ntest : 2\n", str);
    }

    @Test
    public void testErr() {
        String str = TextCount.count("no");
        assertEquals("Ошибка чтения файла", str);
    }
}
