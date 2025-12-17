package func;

import intetfaces.FunctionOnInterval;

public class ExpFunction implements FunctionOnInterval {
    private final double a, b, start, end;
    public ExpFunction(double a, double b, double start, double end) {
        this.a = a; this.b = b; this.start = start; this.end = end;
    }
    public double calculate(double x) { return a * Math.exp(x) + b; }
    public double getStart() { return start; }
    public double getEnd() { return end; }
}