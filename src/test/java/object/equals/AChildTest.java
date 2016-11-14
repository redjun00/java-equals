package object.equals;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AChildTest {

    @Test   //인자가 null일 경우에는 false를 리턴합니다.
    public void 인자가_null일_경우_false_반환(){

        AChild AChild = new AChild(10);
        AChild.setName("Tom");

        AChild objectB = null;

        assertFalse(AChild.equals(objectB));
    }

    @Test   //어떤 객체 x에 대해서도 x.equals(x)는 반드시 true를 리턴해야 합니다.
    public void 동일한_객체에_대해서는_반드시_true_반환(){
        AChild AChild = new AChild(10);
        AChild.setName("Tom");

        AChild extendsClassB = AChild;

        assertTrue(AChild.equals(extendsClassB));
    }

    @Test   //대칭성. 어떠한 x,y에 대해서도 x.equals(y) 와 y.equals(x)는 같은 값을 가져야 합니다.
    public void 대칭성(){
        ClassA objectA = new ClassA();
        objectA.setName("Tom");

        ClassA aChild = new AChild(0);
        aChild.setName("Tom");

        assertFalse(objectA.equals(aChild));// TODO 이게 false를 반환하는게 맞는지 모르겠다.
        assertFalse(aChild.equals(objectA));
    }

    @Test   //대칭성. 어떠한 x,y에 대해서도 x.equals(y) 와 y.equals(x)는 같은 값을 가져야 합니다.
    public void 대칭성2(){
        AChild AChild_Tom = new AChild(10);
        AChild_Tom.setName("Tom");

        AChild AChild_Jerry = new AChild(10);
        AChild_Jerry.setName("Jerry");

        assertFalse(AChild_Tom.equals(AChild_Jerry));
        assertFalse(AChild_Jerry.equals(AChild_Tom));
    }

    @Test   //대칭성. 어떠한 x,y에 대해서도 x.equals(y) 와 y.equals(x)는 같은 값을 가져야 합니다.
    public void 대칭성3(){
        AChild AChild_Tom = new AChild(10);
        AChild_Tom.setName("Tom");

        AChild AChild_Tom2 = new AChild(10);
        AChild_Tom2.setName("Tom");

        assertTrue(AChild_Tom.equals(AChild_Tom2));
        assertTrue(AChild_Tom2.equals(AChild_Tom));
    }


    @Test   //추이성: 어떤 x,y,z에 대해서도 x.equals(y)와 y.equals(z)가 true면 x.equals(z)도 true를 리턴해야 합니다.
    public void 추이성(){
//        인자가 자기 자신의 클래스 타입이 아닐 경우 무조건 false를 리턴하고, 대칭성을 명확히 지켜주면 됩니다.
        AChild objectA = new AChild(10);
        objectA.setName("Tom");

        AChild objectB = new AChild(10);
        objectB.setName("Tom");

        AChild objectC = new AChild(10);
        objectC.setName("Tom");

        assertTrue(objectA.equals(objectB));
        assertTrue(objectB.equals(objectC));
        assertTrue(objectA.equals(objectC));
    }
}
