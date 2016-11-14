package object.hashcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class OverrideHashCodeTest {

    @Test
    public void hash_code_method를_오버라이드_하면_중복해서_안들어간다(){
        Map<OverrideHashCode, Integer> map = new HashMap<>();
        map.put(new OverrideHashCode("test"), 20);
        map.put(new OverrideHashCode("test"), 20);

        assertEquals("Map=" + map.values(), 1, map.size());
    }
}
