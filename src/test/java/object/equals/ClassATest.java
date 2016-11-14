package object.equals;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ClassATest {

    @Test   //인자가 null일 경우에는 false를 리턴합니다.
    public void 인자가_null일_경우_false_반환(){

        ClassA objectA = new ClassA();
        objectA.setName("Tom");

        ClassA objectB = null;

        assertFalse(objectA.equals(objectB));
    }

    @Test   //어떤 객체 x에 대해서도 x.equals(x)는 반드시 true를 리턴해야 합니다.
    public void 동일한_객체에_대해서는_반드시_true_반환(){
        ClassA objectA = new ClassA();
        objectA.setName("Tom");

        ClassA objectB = objectA;

        assertTrue(objectA.equals(objectB));
    }

    @Test   //대칭성. 어떠한 x,y에 대해서도 x.equals(y) 와 y.equals(x)는 같은 값을 가져야 합니다.
    public void 대칭성(){
        ClassA objectA = new ClassA();
        objectA.setName("Tom");

        ClassA objectB = new ClassA();
        objectB.setName("Tom");

        assertTrue(objectA.equals(objectB));
        assertTrue(objectB.equals(objectA));
    }

    @Test   //대칭성. 어떠한 x,y에 대해서도 x.equals(y) 와 y.equals(x)는 같은 값을 가져야 합니다.
    public void 대칭성2(){
        ClassA objectA = new ClassA();
        objectA.setName("Tom");

        ClassA objectB = new ClassA();
        objectB.setName("Jerry");

        assertFalse(objectA.equals(objectB));
        assertFalse(objectB.equals(objectA));
    }

    @Test   //추이성: 어떤 x,y,z에 대해서도 x.equals(y)와 y.equals(z)가 true면 x.equals(z)도 true를 리턴해야 합니다.
    public void 추이성(){
//        인자가 자기 자신의 클래스 타입이 아닐 경우 무조건 false를 리턴하고, 대칭성을 명확히 지켜주면 됩니다.
        ClassA objectA = new ClassA();
        objectA.setName("Tom");

        ClassA objectB = new ClassA();
        objectB.setName("Tom");

        ClassA objectC = new ClassA();
        objectC.setName("Tom");

        assertTrue(objectA.equals(objectB));
        assertTrue(objectB.equals(objectC));
        assertTrue(objectA.equals(objectC));
    }
}
