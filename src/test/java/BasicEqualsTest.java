import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BasicEqualsTest {

    @Test
    public void string_equals(){
        String some = new String("Tom");
        String another = new String("Tom");

        assertTrue(some.equals(another));
        assertFalse(some == another);
    }
}
