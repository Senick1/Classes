package class9;

import class9.ownexceptions.ValueIsNegative;
import class9.ownexceptions.ValueIsNull;

public class Scales {

    int weight;

    public Scales(int weight) {
        if (weight == 0) throw new ValueIsNull();
        if (weight < 0) throw new ValueIsNegative("System failure");
        this.weight = weight;
    }
}
