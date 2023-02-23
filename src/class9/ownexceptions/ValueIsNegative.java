package class9.ownexceptions;

public class ValueIsNegative extends RuntimeException{

    public ValueIsNegative(String message) {
        super(message);
    }
}
