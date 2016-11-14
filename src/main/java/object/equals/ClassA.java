package object.equals;

public class ClassA {

    private String name;    //equals() 나 hashcode()에 name이라는 변수를 사용하려면 변경가능하면 안되지만, 예제를 만들어주기 위해서 잠시 변경 가능하도록 하였다. 참고로 변경가능하게 하면 중복된 값이 들어갈 수도 있다.

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){

        if(obj == null) return false; //인자가 null이면 false를 반환한다.
        if(obj == this) return true;  //인자의 레퍼런스 값이 본 객체와 같다면 true를 반환한다.
        if(obj.getClass() == this.getClass()){
            return this.getName().equals(((ClassA)obj).getName());   //name 값이 같으면 같다고 본다.
        }
        return false;
    }
}
