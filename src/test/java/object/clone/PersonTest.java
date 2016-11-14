package object.clone;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertTrue;

public class PersonTest {

    /*
    clone()
    레퍼런스가 같은 것이 아니라 그 내용을 복사.

    구현 명세.
    1. x.clone() != x
    2. x.clone().getClass() == x.getClass()
    3. x.clone().equals(x) == true
    4. 어떠한 생성자도 호출하면 안 된다.

    public으로 overide하지 않았을 경우는 외부에서 호출할 수 없습니다.
    clone을 구현할 때는 반드시 java.lang.Cloneable 인터페이스를 implements해야 합니다.


    clone 메쏘드를 오버라이딩할 때는 다음 사항을 꼭 확인.
    1. Cloneable인터페이스를 반드시 implements한다.
    2. 멤버 변수는 원시 변수 , Immutable Class 또는 enum 형식일 때는 원본의 값을 바로 대입해도 되지만, 그렇지 않을 때는 멤버변수의 clone을 호출하여 복사해야 한다.
        여기서 멤버변수가 clone을 제대로 지원하지 않는다면, 그 멤버변수를 가지는 클래스도 clone을 제대로 구현할 수 없다.
    3. equals 와 hashCode를 정확히 구현해야 한다. HashSet 등에 복사한 값을 넣을 때 충돌이 생기지 않도록 한다.
    4. final 멤버 변수의 사용이 없는 지 확인한다. 있다면, clone에서 그 멤버 변수에 대한 값을 복사하지 않고, 레퍼런스를 유지하는 것이 올바른 구현인지 고려해야 한다.
     */

    @Test   //x.clone() != x
    public void clone한_객체는_같은_레퍼런스를_가지고_있지_않는다() throws CloneNotSupportedException {

        Person person = new Person();
        person.setName("Tom");
        person.setBirth(new Date());
        Person clone = (Person) person.clone();

        assertTrue(person != clone);
    }

    @Test   //x.clone().getClass() == x.getClass()
    public void clone한_객체는_같은_종류의_class_type이다() throws CloneNotSupportedException {

        Person person = new Person();
        person.setName("Tom");
        person.setBirth(new Date());
        Person clone = (Person) person.clone();

        assertTrue(person.getClass() == clone.getClass());
    }

    @Test   //x.clone().equals(x) == true
    public void clone한_객체는_본_객체와_동일한_값을_가지고있다() throws CloneNotSupportedException {
        Person person = new Person();
        person.setName("Tom");
        person.setBirth(new Date());
        Person clone = (Person) person.clone();

        assertTrue(person.equals(clone));
        assertTrue(clone.equals(person));
    }
}
