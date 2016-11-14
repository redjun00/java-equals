package object.clone;

import java.util.Date;

public class Person implements Cloneable{

    private String name;
    private Date birth;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public int hashCode(){
        int PRIME = 31;
        int hashcode = 1;
        hashcode = PRIME * hashcode + ( (name == null)? 0:name.hashCode() );
        hashcode = PRIME * hashcode + ( (birth == null)? 0:birth.hashCode() );
        return hashcode;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null) return false;

        if(obj.getClass() != this.getClass()) return false;
        if(this.name != ((Person) obj).name) return false;
        if(this.birth != ((Person) obj).birth) return false;
        return true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Person person = (Person) super.clone();
        person.name = name;
        person.birth = birth;
        return person;
    }


}
