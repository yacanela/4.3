package func2;

import intetfaces.*;

public class IntegralFunctional<T extends FunctionOnInterval> implements Functional<T> {
    private final double a, b;

    public IntegralFunctional(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate(T f) {
        if (a < f.getStart() || b > f.getEnd()) {
            throw new IllegalArgumentException("Interval out of function bounds");
        }
        int steps = 1000;
        double h = (b - a) / steps;
        double sum = 0;
        for (int i = 0; i < steps; i++) {
            sum += f.calculate(a + h * (i + 0.5));
        }
        return sum * h;
    }
}