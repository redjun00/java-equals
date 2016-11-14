package object.hashcode;

public class OverrideHashCode{

    private final String message;   //hashCode나 equals의 key로 Immutable을 사용할 수 없을 때는 변경 가능한 필드들은 hashCode와 equals에서 사용하면 안 됩니다.

    public OverrideHashCode(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return message.equals(((OverrideHashCode)obj).message);
    }

    @Override
    public int hashCode(){
        final int PRIME = 31;
        int hashcode = 1;
        hashcode = PRIME * hashcode + ((message == null)? 0:message.hashCode());
        return hashcode;
    }
}
