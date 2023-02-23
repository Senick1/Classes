package class9;

import class9.ownexceptions.TooBigValue;
import class9.ownexceptions.ValueIsNegative;
import class9.ownexceptions.ValueIsNull;

public class ExceptionCatch {

    public void tryCatch() {
        try {
            //new Scales(0);
            //new Scales(-20);
            throwException(1300);
        } catch (ValueIsNegative | TooBigValue e) {
            e.printStackTrace();
        } catch (ValueIsNull ex) {
            System.out.println("There is no product");
        } finally {
            System.out.println("Finally block");
        }
    }

    private void throwException(int weight) throws TooBigValue {
        if (weight > 1000) throw new TooBigValue("1000 is weight limit");
    }
}
