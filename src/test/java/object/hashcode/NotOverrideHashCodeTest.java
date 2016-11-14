package object.hashcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class NotOverrideHashCodeTest {

    @Test
    public void hash_code_method를_오버라이드_안하면_중복_값_들어간다(){
        Map<NotOverrideHashCode, Integer> wrongMap = new HashMap<>();
        wrongMap.put(new NotOverrideHashCode("test"), 20);
        wrongMap.put(new NotOverrideHashCode("test"), 20);

        assertEquals("wrongMap=" + wrongMap.values(), 2, wrongMap.size());
    }
}
