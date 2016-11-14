package object.hashcode;

public class NotOverrideHashCode {
    private final String message;

    public NotOverrideHashCode(String message) {
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
        return message.equals(((NotOverrideHashCode)obj).message);
    }
}
