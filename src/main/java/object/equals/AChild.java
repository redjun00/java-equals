package object.equals;

public class AChild extends ClassA {

    private final int age;

    public AChild(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public boolean equals(Object obj){
        if( ! super.equals(obj)){
            return false;
        }

        if(this.getClass() == obj.getClass()){      //동일한 타입의 클래스이면,
            System.out.println("this.age=" + this.age + ", obj.age=" + ((AChild) obj).getAge());
            return ( this.age == ((AChild) obj).getAge() ); //그리고 본 클래스(object.equals.AChild)의 나머지 조건도 같은지 확인한다.
        }
        return false;
    }
}
