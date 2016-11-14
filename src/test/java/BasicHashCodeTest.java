import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BasicHashCodeTest {

    /*
    Hashcode
        객체에 대한 서명, 또는 checksum과 같은 것. 객체 인식용 정수.
        자바에서 동일한 이름의 객체가 여러 개 생성될 수 있는데 이 객체들은 이름만 같을 뿐 서로 다른 상태를 가진 가진 객체들이 되는 것이다. 이런 객체를 구별하기 위해, 고유한 정수값으로 출력시켜주는 메소드가 바로 hashCode()다.
        일반적으로, 이것은 객체의 내부 주소를 정수값로 변환하는 형태로 구현된다. (Heap에 있는 객체의 메모리 주소를 바탕으로 생성.)
        객체가 서로 다른 내용을 포함한다면 반드시 달라야 하며 ,equals() 메소드가 같다면 일반적으로 같은 값을 가진다.

    hashCode의 구현 규약
        1. 같은 자바 어플리케이션에서 실행된다면, equals에서 비교하는 멤버변수가 변경되지 않는다면, 같은 int 값을 리턴해야 합니다.
            equals에서 쓰는 멤버 변수를 hashCode를 구현하는데도 똑같이 쓰면 됩니다.
        2. a.equals(b)가 true일 경우 a의 hashCode와 b의 hashCode는 같은 값을 리턴해야 합니다.
        3. a.equals(b)가 false일 경우 a의 hashCode와 b의 hashCode가 반드시 다른 값을 리턴할 필요는 없지만, 가능하면 다른 값을 리턴하는 게 좋습니다.

     */

    @Test
    public void stirng_hashcode_같은값(){
        String stringA = "test";
        String stringB = "test";

        System.out.println("#stringA=" + stringA.hashCode());
        System.out.println("#stringB=" + stringB.hashCode());

        assertTrue(stringA.hashCode() == stringB.hashCode());
        assertTrue(stringA.equals(stringB));
    }

    @Test
    public void stirng_hashcode_다른값(){
        String stringA = "A";
        String stringB = "B";

        System.out.println("#stringA=" + stringA.hashCode());
        System.out.println("#stringB=" + stringB.hashCode());

        assertTrue(stringA.hashCode() != stringB.hashCode());
        assertFalse(stringA.equals(stringB));
    }
}
