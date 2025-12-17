package func2;

import intetfaces.*;

public class SumEndPointsAndMid<T extends FunctionOnInterval> implements Functional<T> {
    public double calculate(T f) {
        double mid = (f.getStart() + f.getEnd()) / 2.0;
        return f.calculate(f.getStart()) + f.calculate(f.getEnd()) + f.calculate(mid);
    }
}
